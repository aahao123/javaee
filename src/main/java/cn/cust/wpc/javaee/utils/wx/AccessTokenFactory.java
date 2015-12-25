package cn.cust.wpc.javaee.utils.wx;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * AccessToken 的工厂类
 */
public class AccessTokenFactory {
//    private String appid = "wxeb0835681c3e48b5";
    private String appid = "wx4a152626b81b2988";
//    private String appsecret = "8d7b7aeebc5d9ab2a6b2c3f333f3eba1";
    private String appsecret = "01aec0676a74b1268df498b0eff13c25";

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