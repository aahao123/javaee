package cn.cust.wpc.javaee.weixin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * 模拟微信公众平台用户发送消息给微信公众平台，并得到回复信息
 */
public class WeiXinRequest {
    /**
     * 向指定URL发送GET方法的请求
     *
     * @param url   发送请求的URL
     * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return URL 所代表远程资源的响应结果
     */
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");

            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream(), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

    /**
     * 向指定 URL 发送POST方法的请求
     *
     * @param url   发送请求的 URL
     * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return 所代表远程资源的响应结果
     */
    public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("Pragma:", "no-cache");
            conn.setRequestProperty("Cache-Control", "no-cache");
            conn.setRequestProperty("Content-Type", "text/xml");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！" + e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //发送 GET 请求
//        String s=WeiXinRequest.sendGet("http://localhost:6144/Home/RequestString", "key=123&v=456");
//        System.out.println(s);

        String xmlStr = "<xml>" +
                "<ToUserName><![CDATA[gh_aa7765d42859]]></ToUserName>" +
                "<FromUserName><![CDATA[112]]></FromUserName>" +
                "<CreateTime>112</CreateTime>" +
                "<MsgType><![CDATA[text]]></MsgType>" +
//                "<Content><![CDATA[四平:成绩：410426199310083511]]></Content>" +
//                "<Content><![CDATA[四平:成绩：101100000]]></Content>" +
//                "<Content><![CDATA[延边:成绩：301100000]]></Content>" +
//                "<Content><![CDATA[长春:成绩：410426199310083511]]></Content>" +
//                "<Content><![CDATA[省直4号:成绩：410426199310083511：123456]]></Content>" +
//                "<Content><![CDATA[白城:成绩：410426199310083511：123456]]></Content>" +
//                "<Content><![CDATA[吉林:成绩：410426199310083511：123456]]></Content>" +
//                "<Content><![CDATA[三支一扶:成绩：410426199310083511：123456]]></Content>" +
//                "<Content><![CDATA[省直4号：410426199310083511：123456]]></Content>" +
//                "<Content><![CDATA[咨询：这是我的咨询内容]]></Content>" +
//                "<Content><![CDATA[长春]]></Content>" +
                "<Content><![CDATA[你好]]></Content>" +
                "<FuncFlag>0</FuncFlag>" +
                "</xml>";
        //发送 POST 请求
        String sr = WeiXinRequest.sendPost("http://127.0.0.1:8080/znxx/wxpt/coreServlet", xmlStr);
        System.out.println(sr);
    }
}