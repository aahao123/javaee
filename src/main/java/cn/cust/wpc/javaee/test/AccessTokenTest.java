package cn.cust.wpc.javaee.test;

import cn.cust.wpc.javaee.utils.wx.AccessTokenUtil;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by wpc on 15/12/24.
 */
public class AccessTokenTest {
    public String testAccessToken() {
        String appid = "wxeb0835681c3e48b5";
        String appSecret = "8d7b7aeebc5d9ab2a6b2c3f333f3eba1";
        String content = null;
        try {
            content = AccessTokenUtil.accessToken(appid, appSecret);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static void main(String[] args){
        String json = new AccessTokenTest().testAccessToken();
        System.out.println(json);

    }

}