package cn.cust.wpc.javaee.cust;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wpc on 15/12/9.
 */
public class CustLoginTeacherValue {

    private HttpClient client = new DefaultHttpClient();
    private static String loginUrl = "http://jwgl.cust.edu.cn/teachweb/Login.aspx";
    private static String teacherValueUrl = "http://jwgl.cust.edu.cn/teachweb/jspg/TeacherEvaluate.aspx";
    private String VIEWSTATE = null;

    /**
     * 模拟学生登陆
     *
     * @param username
     * @param password
     * @throws IOException
     */
    public void custLogin(String username, String password) throws IOException {
        System.out.println("＋＋＋＋＋＋＋＋＋＋评估开始＋＋＋＋＋＋＋＋＋＋");
        List<BasicNameValuePair> formParams = new ArrayList<BasicNameValuePair>();
        formParams.add(new BasicNameValuePair("role", "student"));
        formParams.add(new BasicNameValuePair("username", username));
        formParams.add(new BasicNameValuePair("password", password));
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formParams, "UTF-8");
        if (post(loginUrl, formParams).contains("/teachweb/index1.aspx")) {
            System.out.println("登陆成功");
        }else {
            System.out.println("登陆失败");
        }
        teacherValue();
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
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < radios.size(); i++) {
            radioName = radios.get(i).attr("name");
            radioValue = radios.get(i).attr("value");
            if (!map.containsKey(radioName)) {
                map.put(radioName, radioValue);
                formParams.add(new BasicNameValuePair(radioName, radioValue));
                score += Integer.parseInt(radioValue);
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

    public static void main(String[] args) throws IOException {
        new CustLoginTeacherValue().custLogin("120522119", "120522119");
    }
}
