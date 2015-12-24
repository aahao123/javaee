package cn.cust.wpc.javaee.utils.wx;

import cn.cust.wpc.javaee.utils.HttpUtil;
import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by wpc on 15/12/24.
 */
public class AccessTokenUtil {
    /**
     * 根据 appid 和 appSecret 获得 access_token
     * @param appid
     * @param appSecret
     */
    public static String accessToken(String appid,String appSecret) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+appid+"&secret="+appSecret;
        HttpEntity entity = HttpUtil.get(null, url);
        JSONObject jsonObject = JSONObject.fromObject(HttpUtil.entityToString(entity));
        return jsonObject.get("access_token").toString();
    }


}