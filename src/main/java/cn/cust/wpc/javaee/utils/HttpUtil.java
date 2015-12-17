package cn.cust.wpc.javaee.utils;

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
import java.util.List;

/**
 * Created by wpc on 15/12/17.
 */
public class HttpUtil {

    private static HttpClient client = new DefaultHttpClient();

    public void get() {
    }

    /**
     * 发送post请求
     * @param post 当 post 需要设置 head 时，需要传入
     * @param url
     * @param params
     * @return
     * @throws URISyntaxException
     * @throws IOException
     */
    public static HttpEntity post(HttpPost post, String url, List<BasicNameValuePair> params) throws URISyntaxException, IOException {
        if (post == null) {
            post = new HttpPost();
        }

        post.setURI(new URI(url));

        if (params != null) {
            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
            post.setEntity(entity);
        }
        HttpResponse response = client.execute(post);
        return response.getEntity();
    }

    /**
     * 将 HttpEntity 转换成 String 类型
     * @param entity
     * @return
     * @throws IOException
     */
    public static String entityToString(HttpEntity entity) throws IOException {
        return EntityUtils.toString(entity);
    }

}