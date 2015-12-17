package cn.cust.wpc.javaee.weixin;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * 微信公众平台模拟登陆
 */
public class SimulationWxLogin {

    private HttpClient client = new DefaultHttpClient();

    public void weiXinLogin() throws IOException, URISyntaxException {
        List<BasicNameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("pwd","88dfc7c9d2a8669e2f7d9e36130fd356"));
        params.add(new BasicNameValuePair("username","1195746619@qq.com"));
        params.add(new BasicNameValuePair("f","json"));
        params.add(new BasicNameValuePair("imgcode",""));

        HttpPost post = new HttpPost();
        post.setHeader("Host","mp.weixin.qq.com");
        post.setHeader("Referer","https://mp.weixin.qq.com/");
        post.setURI(new URI("https://mp.weixin.qq.com/cgi-bin/login"));
        HttpEntity entity = post(post,params);


        String content = entityToString(entity);
        System.out.println(content);
    }

    public HttpEntity post(HttpPost post, List<BasicNameValuePair> formParams) throws IOException {
        if (formParams != null) {
            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formParams, "UTF-8");
            post.setEntity(entity);
        }
        HttpResponse response = client.execute(post);
        HttpEntity result = response.getEntity();
        return result;
    }

    public String entityToString(HttpEntity entity) throws IOException {
        return EntityUtils.toString(entity);
    }

    public static void main(String[] args){
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