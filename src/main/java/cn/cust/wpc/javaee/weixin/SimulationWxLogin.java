package cn.cust.wpc.javaee.weixin;

import cn.cust.wpc.javaee.utils.HttpUtil;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

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
        HttpEntity entity = HttpUtil.post(client,post, loginUrl, params);
        String content = HttpUtil.entityToString(entity);
        System.out.println(content);
        imageTextPage(post);
    }

    public void imageTextPage(HttpPost post) throws IOException, URISyntaxException {
        String url = "https://mp.weixin.qq.com/cgi-bin/appmsg?begin=0&count=10&t=media/appmsg_list&type=10&action=list_card&lang=zh_CN&token=2051577624";
        HttpEntity entity = HttpUtil.post(client,post, url, null);
        String content = HttpUtil.entityToString(entity);
        System.out.println(content);
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