package cn.cust.wpc.javaee.utils.wx;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by wpc on 15/12/25.
 */
public class AccessTokenFactory {
    private String appid = "wxeb0835681c3e48b5";
    private String appsecret = "8d7b7aeebc5d9ab2a6b2c3f333f3eba1";

    public AccessTokenFactory() {
    }

    public AccessTokenFactory(String appid, String appsecret) {
        this.appid = appid;
        this.appsecret = appsecret;
    }

    public String accessToken() throws IOException, URISyntaxException {
        return AccessTokenUtil.accessToken(appid, appsecret);
    }

    public static AccessTokenFactory getInstance() {
        return new AccessTokenFactory();
    }

    public static AccessTokenFactory getInstance(String appid, String appsecret) {
        return new AccessTokenFactory(appid, appsecret);
    }
}