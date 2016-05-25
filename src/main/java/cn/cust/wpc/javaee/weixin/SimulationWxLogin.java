package cn.cust.wpc.javaee.weixin;

import cn.cust.wpc.javaee.utils.HttpUtil;
import cn.cust.wpc.javaee.weixin.domain.ImageText;
import cn.cust.wpc.javaee.weixin.domain.imagetext.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.ezmorph.Morpher;
import net.sf.ezmorph.MorpherRegistry;
import net.sf.ezmorph.bean.BeanMorpher;
import net.sf.json.JSONObject;
import net.sf.json.util.JSONUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 微信公众平台模拟登陆
 */
public class SimulationWxLogin {

    /**
     * 微信公众平台登陆网址
     */
    private static final String LOGINURL = "https://mp.weixin.qq.com/cgi-bin/login";
    /**
     * 图文总量
     */
    private static int twTotal = 0;

    private HttpClient client = new DefaultHttpClient();
    private HttpPost post;

    public SimulationWxLogin() {
        post = new HttpPost();
        post.setHeader("Referer", "https://mp.weixin.qq.com/");
    }

    /**
     * 模拟登陆微信公众平台
     *
     * @param username 用户名
     * @param password 加密之后的密码
     * @throws IOException
     * @throws URISyntaxException
     */
    public void weiXinLogin(String username, String password) throws IOException, URISyntaxException {

        List<BasicNameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("pwd", password));
        params.add(new BasicNameValuePair("username", username));
        params.add(new BasicNameValuePair("f", "json"));
        params.add(new BasicNameValuePair("imgcode", ""));

        HttpEntity entity = HttpUtil.post(post, LOGINURL, params);
        String content = HttpUtil.entityToString(entity);
        String token = content.substring(content.indexOf("token") + 6, content.length() - 2);
        readImageText(post, token);
    }

    /**
     * 读取图文素材库
     *
     * @param post
     * @param token
     * @throws IOException
     * @throws URISyntaxException
     */
    public void readImageText(HttpPost post, String token) throws IOException, URISyntaxException {
        if (twTotal == 0) {
            System.out.println("------------------------第零页-----------------------");
            String url = "https://mp.weixin.qq.com/cgi-bin/appmsg?begin=0&count=10&t=media/appmsg_list&type=10&action=list_card&lang=zh_CN&token=" + token;
            HttpEntity entity = HttpUtil.post(post, url, null);
            String content = HttpUtil.entityToString(entity);
            twTotalAndPages(content);
            parseJsonTwItems(content);
        }

        for (int i = 10; i < twTotal; i += 10) {
            System.out.println("------------------------第" + (i / 10) + "页-----------------------");
            String url = "https://mp.weixin.qq.com/cgi-bin/appmsg?begin=" + i + "&count=10&t=media/appmsg_list2&type=10&action=list_card&lang=zh_CN&token=" + token;
            HttpEntity entity = HttpUtil.post(post, url, null);
            String content = HttpUtil.entityToString(entity);
            parseJsonTwItems(content);
        }
    }

    /**
     * 得到图文素材的总数量
     *
     * @param content
     * @throws IOException
     */
    public void twTotalAndPages(String content) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> map = objectMapper.readValue(content, Map.class);
        Map<String, Object> fileCnt = (Map<String, Object>) ((Map<String, Object>) map.get("app_msg_info")).get("file_cnt");
        twTotal = (int) fileCnt.get("app_msg_cnt");
    }

    /**
     * 得到每一页的图文素材列表
     *
     * @param content
     * @throws IOException
     */
    public void parseJsonTwItems(String content) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> map = objectMapper.readValue(content, Map.class);
        List<Object> tws = (List<Object>) ((Map<String, Object>) map.get("app_msg_info")).get("item");
        for (int i = 0; i < tws.size(); i++) {
            ImageText imageText = objectMapper.readValue(objectMapper.writeValueAsString(tws.get(i)), ImageText.class);
            System.out.println(imageText.toString());
        }
    }

    public static void main(String[] args) throws IOException, URISyntaxException {
        String username = "1195746619@qq.com";
        String password = "88dfc7c9d2a8669e2f7d9e36130fd356";
        SimulationWxLogin simulationWxLogin = new SimulationWxLogin();
        simulationWxLogin.weiXinLogin(username, password);
    }

}