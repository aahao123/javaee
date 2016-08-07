package cn.cust.wpc.javaee.cust;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wpc on 15/12/9.
 */
public class CustLoginTeacherValue {

    private HttpClient client = new DefaultHttpClient();
    private static String loginUrl = "http://jwgl.cust.edu.cn/teachwebsl/login.aspx";

    private static String teacherValueUrl = "http://jwgl.cust.edu.cn/teachweb/jspg/TeacherEvaluate.aspx";
    private String VIEWSTATE = null;

    /**
     * 模拟学生登陆
     *
     * @param username
     * @param password
     * @throws IOException
     */
    public void custLogin(String username, String password) throws IOException, URISyntaxException {
        System.out.println("＋＋＋＋＋＋＋＋＋＋评估开始＋＋＋＋＋＋＋＋＋＋");
        List<BasicNameValuePair> formParams = new ArrayList<BasicNameValuePair>();
        formParams.add(new BasicNameValuePair("Button1", "登录"));
        formParams.add(new BasicNameValuePair("txtUserName", username));
        formParams.add(new BasicNameValuePair("txtPassWord", password));
        formParams.add(new BasicNameValuePair("__EVENTVALIDATION","/wEWBAK4vfWFDAKl1bKzCQK1qbSWCwKM54rGBg=="));
        formParams.add(new BasicNameValuePair("__VIEWSTATE","/wEPDwUJMTQyNDg3OTM5ZGQ="));
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formParams, "UTF-8");
        String content = post(loginUrl, formParams);
        System.out.println(content);


        Document document = Jsoup.parse(content);
        String newLoginUrl = document.getElementsByTag("a").attr("href");
        System.out.println(newLoginUrl);

        content = get(null, newLoginUrl);
//        System.out.println(content);

        if(content.contains("首 页")){
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }
//        teacherValue();

        content = get(null,"http://jwgl.cust.edu.cn/teachweb/cjcx/StudentGrade.aspx");
        System.out.println(content);

        /*if (post(loginUrl, formParams).contains("/teachweb/index1.aspx")) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登陆失败");
        }
        teacherValue();*/
    }

    /**
     * 登陆之后获取教师评估页面，并进行分析
     *
     * @throws IOException
     */
    public void teacherValue() throws IOException {
        for (String teacherNo : allTeacherNo()) {
            intoTeacherpage(teacherNo, VIEWSTATE);
        }
        System.out.println("＋＋＋＋＋＋＋＋＋＋评估结束＋＋＋＋＋＋＋＋＋＋");
    }

    /**
     * 获得所有教师的teacherNo
     *
     * @throws IOException
     */
    public List<String> allTeacherNo() throws IOException {
        List<String> teacherNos = new ArrayList<>();

        Document doc = Jsoup.parse(post(teacherValueUrl, null));
        VIEWSTATE = doc.select("input[name=__VIEWSTATE]").attr("value");
        Elements options = doc.getElementsByTag("option");

        for (Element e : options) {
            if (!"".equals(e.attr("value"))) {
                teacherNos.add(e.attr("value"));
            }
        }
        return teacherNos;
    }

    /**
     * post 方式提交方法
     *
     * @param url
     * @param formParams
     * @return
     * @throws IOException
     */
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

    /**
     * 发送 get 请求
     *
     * @param get
     * @param url
     * @return
     * @throws URISyntaxException
     * @throws IOException
     */
    public String get(HttpGet get, String url) throws URISyntaxException, IOException {
        if (get == null) {
            get = new HttpGet();
        }
        get.setURI(new URI(url));

        HttpResponse response = client.execute(get);
        return EntityUtils.toString(response.getEntity());
    }

    /**
     * 进入指定老师的评估页面，对该老师的评估页面进行分析，并打分提交
     *
     * @param teacherNo
     * @param VIEWSTATE
     * @throws IOException
     */
    public void intoTeacherpage(String teacherNo, String VIEWSTATE) throws IOException {
        List<BasicNameValuePair> formParams = new ArrayList<BasicNameValuePair>();
        formParams.add(new BasicNameValuePair("__EVENTTARGET", "m_ddlTeacher"));
        formParams.add(new BasicNameValuePair("m_ddlTeacher", teacherNo));
        formParams.add(new BasicNameValuePair("__VIEWSTATE", VIEWSTATE));
        formParams.add(new BasicNameValuePair("__EVENTARGUMENT", ""));

        submitTeacherData(post(teacherValueUrl, formParams));
    }

    /**
     * 提交对该老师的打分情况
     *
     * @param content
     * @throws IOException
     */
    public void submitTeacherData(String content) throws IOException {
        Document doc = Jsoup.parse(content);
        List<BasicNameValuePair> formParams = new ArrayList<BasicNameValuePair>();

        String teacherNo = doc.select("option[selected=selected]").attr("value");
        String VIEWSTATENOW = doc.select("input[name=__VIEWSTATE]").attr("value");
        String submitvalue = doc.select("input[type=submit]").attr("value");
        String submitname = doc.select("input[type=submit]").attr("name");

        Elements radios = doc.select("input[type=radio]");
        String radioName = "";
        String radioValue = "";
        int score = 0;
        for (int i = 0; i < radios.size(); i++) {
            radioName = radios.get(i).attr("name");
            radioValue = radios.get(i).attr("value");

            if (formParams.isEmpty()) {
                formParams.add(new BasicNameValuePair(radioName, radioValue));
                score += Integer.parseInt(radioValue);
            } else {
                if (!formParams.get(formParams.size() - 1).getName().equals(radioName)) {
                    formParams.add(new BasicNameValuePair(radioName, radioValue));
                    score += Integer.parseInt(radioValue);
                }
            }
        }

        formParams.add(new BasicNameValuePair("__EVENTTARGET", "m_ddlTeacher"));
        formParams.add(new BasicNameValuePair("_ctl45", String.valueOf(score)));
        formParams.add(new BasicNameValuePair("_ctl44", ""));
        formParams.add(new BasicNameValuePair("m_ddlTeacher", teacherNo));
        formParams.add(new BasicNameValuePair("__VIEWSTATE", VIEWSTATENOW));
        formParams.add(new BasicNameValuePair("__EVENTARGUMENT", ""));
        formParams.add(new BasicNameValuePair(submitname, submitvalue));

        if (post(teacherValueUrl, formParams).contains("数据提交成功")) {
            System.out.println("提交成功");
        } else {
            System.out.println("提交失败");
        }
    }

    public static void main(String[] args) throws IOException, URISyntaxException {
        new CustLoginTeacherValue().custLogin("2012001086", "131452100");
//        System.out.println("213657F01F97ABB3F3A5224304A7B7D0".length());

    }

}
