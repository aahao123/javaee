package cn.cust.wpc.javaee.weixin;

import cn.cust.wpc.javaee.utils.HttpUtil;
import cn.cust.wpc.javaee.weixin.domain.imagetext1.*;
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

    private HttpClient client = new DefaultHttpClient();
    private HttpPost post;

    public SimulationWxLogin(){
        post = new HttpPost();
        post.setHeader("Referer", "https://mp.weixin.qq.com/");
    }

    /**
     * 模拟登陆微信公众平台
     * @throws IOException
     * @throws URISyntaxException
     */
    public void weiXinLogin() throws IOException, URISyntaxException {

        List<BasicNameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("pwd", "88dfc7c9d2a8669e2f7d9e36130fd356"));
        params.add(new BasicNameValuePair("username", "1195746619@qq.com"));
        params.add(new BasicNameValuePair("f", "json"));
        params.add(new BasicNameValuePair("imgcode", ""));

        String loginUrl = "https://mp.weixin.qq.com/cgi-bin/login";
        HttpEntity entity = HttpUtil.post(post, loginUrl, params);
        String content = HttpUtil.entityToString(entity);
        String token = content.substring(content.indexOf("token")+6,content.length()-2);
        imageTextPage(post,token);
    }

    public void imageTextPage(HttpPost post,String token) throws IOException, URISyntaxException {
        String url = "https://mp.weixin.qq.com/cgi-bin/appmsg?begin=0&count=10&t=media/appmsg_list&type=10&action=list_card&lang=zh_CN&token="+token;
        HttpEntity entity = HttpUtil.post(post, url, null);
        String content = HttpUtil.entityToString(entity);

        Map classMap = new HashMap();
        classMap.put("base_resp", BaseResp.class);
        classMap.put("app_msg_info", AppMsgInfo.class);
        classMap.put("file_cnt", FileCnt.class);
        classMap.put("item", Item.class);
        classMap.put("multi_item", MultiItem.class);

        ImageTextJsonObject imageTextJsonObject = (ImageTextJsonObject) JSONObject.toBean(JSONObject.fromObject(content), ImageTextJsonObject.class, classMap);


//        System.out.println(imageTextJsonObject);

//        先往注册器中注册变换器，需要用到ezmorph包中的类
        MorpherRegistry morpherRegistry = JSONUtils.getMorpherRegistry();
        Morpher morpher = new BeanMorpher(Item.class,morpherRegistry);
        morpherRegistry.registerMorpher(morpher);

        List<Item> items = imageTextJsonObject.getApp_msg_info().getItem();
        for(int i = 0;i<items.size();i++){
            Item item = (Item) morpherRegistry.morph(Item.class,items.get(i));
            System.out.println("标题："+item.getTitle());
            System.out.println("描述："+item.getDigest());
            System.out.println("图片url："+item.getImg_url());
            System.out.println("跳转url："+item.getContent_url());
        }
    }

    public static void main(String[] args) {
        SimulationWxLogin simulationWxLogin = new SimulationWxLogin();
        try {
            simulationWxLogin.weiXinLogin();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }

}