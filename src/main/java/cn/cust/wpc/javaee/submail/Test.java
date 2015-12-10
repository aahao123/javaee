package cn.cust.wpc.javaee.submail;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wpc on 15/12/10.
 */
public class Test {
    private static String url = "https://api.submail.cn/mail/send.json";
    private HttpClient client = new DefaultHttpClient();

    public String post(String url, List<BasicNameValuePair> formParams) throws IOException {
        HttpPost post = new HttpPost(url);
        if (formParams != null) {
            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formParams, "UTF-8");
            post.setEntity(entity);
        }
        HttpResponse response = client.execute(post);
        HttpEntity result = response.getEntity();
        return EntityUtils.toString(result);
    }

    public static void main(String[] args) throws IOException {
        List<BasicNameValuePair> formParams = new ArrayList<>();
        formParams.add(new BasicNameValuePair("appid","10847"));
        formParams.add(new BasicNameValuePair("to","1195746619@qq.com"));
        formParams.add(new BasicNameValuePair("subject","我使用submailAPI发送的邮件"));
        formParams.add(new BasicNameValuePair("text","这是邮件内容"));
        formParams.add(new BasicNameValuePair("from","peng.wang@c10847.submailapp.com"));
        formParams.add(new BasicNameValuePair("signature","835728b11cf8ecff7022aec6cc5779f4"));

        String content = new Test().post(url,formParams);
        System.out.println(content);
    }
}
