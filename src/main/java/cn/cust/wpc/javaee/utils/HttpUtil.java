package cn.cust.wpc.javaee.utils;

import net.sf.json.JSONObject;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

/**
 * Created by wpc on 15/12/17.
 */
public class HttpUtil {

    private static HttpClient client = new DefaultHttpClient();
    private static HttpResponse response = null;

    /**
     * 发送 get 请求
     *
     * @param get
     * @param url
     * @return
     * @throws URISyntaxException
     * @throws IOException
     */
    public static HttpEntity get(HttpGet get, String url) throws URISyntaxException, IOException {
        if (get == null) {
            get = new HttpGet();
        }

        get.setURI(new URI(url));

        HttpResponse response = client.execute(get);
        return response.getEntity();
    }

    /**
     * 发送post请求
     *
     * @param post   当 post 需要设置 head 时，需要传入
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
        response = client.execute(post);
        return response.getEntity();
    }

    /**
     * post 请求 发送JSON 数据
     *
     * @param post
     * @param url
     * @param jsonObject
     * @return
     * @throws URISyntaxException
     * @throws IOException
     */
    public static HttpEntity postJson(HttpPost post, String url, JSONObject jsonObject) throws URISyntaxException, IOException {
        if (post == null) {
            post = new HttpPost();
        }
        post.setURI(new URL(url).toURI());
        if (jsonObject != null) {
            StringEntity stringEntity = new StringEntity(jsonObject.toString(), "UTF-8");
            stringEntity.setContentType("application/json");
            post.setEntity(stringEntity);
        }
        response = client.execute(post);
        return response.getEntity();
    }

    public static String postFile(String url, File file) throws IOException {
        PostMethod postMethod = new PostMethod(url);
        FilePart fp = new FilePart("filedata", file);
        Part[] parts = {fp};
        MultipartRequestEntity multipartRequestEntity = new MultipartRequestEntity(parts, postMethod.getParams());
        postMethod.setRequestEntity(multipartRequestEntity);
        org.apache.commons.httpclient.HttpClient client = new org.apache.commons.httpclient.HttpClient();
        client.getHttpConnectionManager().getParams().setConnectionTimeout(50000);// 设置连接时间
        client.executeMethod(postMethod);
        return postMethod.getResponseBodyAsString();
    }

    /**
     * 将 HttpEntity 转换成 String 类型
     *
     * @param entity
     * @return
     * @throws IOException
     */
    public static String entityToString(HttpEntity entity) throws IOException {
        return EntityUtils.toString(entity, "UTF-8");
    }

}