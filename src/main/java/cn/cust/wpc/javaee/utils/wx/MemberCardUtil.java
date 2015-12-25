package cn.cust.wpc.javaee.utils.wx;

import cn.cust.wpc.javaee.utils.HttpUtil;
import cn.cust.wpc.javaee.weixin.domain.card.*;
import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * 微信公众平台会员卡接口工具类
 */
public class MemberCardUtil {

    /**
     * 创建会员卡
     *
     * @param memberCard
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String createMemberCard(CreateMemberCardJSON memberCard) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/card/create?access_token=" + AccessTokenFactory.getInstance().accessToken();
        return redundantCode(url, JSONObject.fromObject(memberCard));
    }

    /**
     * 根据 cardId 获得会员卡详细信息
     *
     * @param cardId
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String memberCardInfoByCardId(String cardId) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/card/get?access_token=" + AccessTokenFactory.getInstance().accessToken();
        String json = "{\"card_id\":\"" + cardId + "\"}";
        return redundantCode(url, JSONObject.fromObject(json));
    }

    /**
     * 设置用于体验会员卡整个流程的白名单
     *
     * @param whiteName
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String whiteNameForTest(WhiteName whiteName) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/card/create?access_token=" + AccessTokenFactory.getInstance().accessToken();
        return redundantCode(url, JSONObject.fromObject(whiteName));
    }

    /**
     * 以二维码形式投放会员卡
     *
     * @param twoCodeCard
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String provideCardTwoCode(TwoCodeCard twoCodeCard) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/card/qrcode/create?access_token=" + AccessTokenFactory.getInstance().accessToken();
        JSONObject jsonObject = JSONObject.fromObject(twoCodeCard);
        return redundantCode(url, jsonObject);
    }

    /**
     * 以接口形式激活会员卡
     *
     * @param activateCard
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String activateMemberCard(ActivateCardJSON activateCard) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/card/membercard/activate?access_token=" + AccessTokenFactory.getInstance().accessToken();
        JSONObject jsonObject = JSONObject.fromObject(activateCard);
        return redundantCode(url, jsonObject);
    }

    /**
     * 更新会员卡信息
     *
     * @param updateMemberCardJSON
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String updateMemberCard(UpdateMemberCardJSON updateMemberCardJSON) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/card/membercard/updateuser?access_token=" + AccessTokenFactory.getInstance().accessToken();
        JSONObject jsonObject = JSONObject.fromObject(updateMemberCardJSON);
        return redundantCode(url, jsonObject);
    }

    /**
     * 查询code接口可以查询当前code是否可以被核销并检查code状态。
     *
     * @param cardId
     * @param code
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String queryCodeStatus(String cardId, String code) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/card/code/get?access_token=" + AccessTokenFactory.getInstance().accessToken();
        String json = "{\"card_id\" : \"" + cardId + "\",\"code\" : \"" + code + "\",\"check_consume\" : true}";
        return redundantCode(url, JSONObject.fromObject(json));
    }

    /**
     * 获取用户已领取的卡券
     *
     * @param openid
     * @param cardId
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String queryUserCard(String openid, String cardId) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/card/user/getcardlist?access_token=" + AccessTokenFactory.getInstance().accessToken();
        String json = "{\"openid\": \"" + openid + "\",\"card_id\": \"" + cardId + "\"}";
        return redundantCode(url, JSONObject.fromObject(json));
    }

    /**
     * 根据CardID和Code查询会员信息
     *
     * @param cardId
     * @param code
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String queryMemberInfo(String cardId, String code) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/card/membercard/userinfo/get?access_token=" + AccessTokenFactory.getInstance().accessToken();
        String json = "{\"card_id\": \"" + cardId + "\",\"code\": \"" + code + "\"}";
        return redundantCode(url, JSONObject.fromObject(json));
    }

    public static String redundantCode(String url, JSONObject jsonObject) throws IOException, URISyntaxException {
        HttpEntity entity = HttpUtil.postJson(null, url, jsonObject);
        return HttpUtil.entityToString(entity);
    }
}