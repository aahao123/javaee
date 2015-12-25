package cn.cust.wpc.javaee.utils.wx;

import cn.cust.wpc.javaee.utils.HttpUtil;
import cn.cust.wpc.javaee.weixin.domain.businessshop.CreateBusinessShopJSON;
import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * 微信门店接口工具类
 */
public class BusinessShopUtil {
    /**
     * 创建门店
     *
     * @param business
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String createBusinessShop(CreateBusinessShopJSON business) throws IOException, URISyntaxException {
        String url = "http://api.weixin.qq.com/cgi-bin/poi/addpoi?access_token=" + AccessTokenFactory.getInstance().accessToken();
        HttpEntity entity = HttpUtil.postJson(null, url, JSONObject.fromObject(business));
        return HttpUtil.entityToString(entity);
    }

    /**
     * 根据poiId获得指定门店的信息
     *
     * @param poiId
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String bussinessInfoByPoiId(String poiId) throws IOException, URISyntaxException {
        String url = "http://api.weixin.qq.com/cgi-bin/poi/getpoi?access_token=" + AccessTokenFactory.getInstance().accessToken();
        String json = "{\"poi_id\":\"" + poiId + "\"}";
        HttpEntity entity = HttpUtil.postJson(null, url, JSONObject.fromObject(json));
        return HttpUtil.entityToString(entity);
    }

    /**
     * 获取门店信息列表
     *
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String bussinessShopList() throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/cgi-bin/poi/getpoilist?access_token=" + AccessTokenFactory.getInstance().accessToken();
        String json = "{\"begin\":0,\"limit\":10}";
        HttpEntity entity = HttpUtil.postJson(null, url, JSONObject.fromObject(json));
        return HttpUtil.entityToString(entity);
    }

    /**
     * 更新门店信息
     *
     * @param business
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String updateBussinessShop(CreateBusinessShopJSON business) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/cgi-bin/poi/updatepoi?access_token=" + AccessTokenFactory.getInstance().accessToken();
        HttpEntity entity = HttpUtil.postJson(null, url, JSONObject.fromObject(business));
        return HttpUtil.entityToString(entity);
    }

    /**
     * 根据poiId删除指定门店的信息
     *
     * @param poiId
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String delBussinessByPoiId(String poiId) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/cgi-bin/poi/delpoi?access_token=" + AccessTokenFactory.getInstance().accessToken();
        String json = "{\"poi_id\":\"" + poiId + "\"}";
        HttpEntity entity = HttpUtil.postJson(null, url, JSONObject.fromObject(json));
        return HttpUtil.entityToString(entity);
    }

    /**
     * 获取门店类目
     *
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String bussinessCategory() throws IOException, URISyntaxException {
        String url = "http://api.weixin.qq.com/cgi-bin/poi/getwxcategory?access_token=" + AccessTokenFactory.getInstance().accessToken();
        HttpEntity entity = HttpUtil.get(null, url);
        return HttpUtil.entityToString(entity);
    }
}