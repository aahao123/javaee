package cn.cust.wpc.javaee.utils.wx;

import cn.cust.wpc.javaee.utils.HttpUtil;
import cn.cust.wpc.javaee.weixin.domain.UserManage.Group;
import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * 微信公众平台用户管理的工具类
 */
public class UserManageUtil {

    /**
     * 创建分组
     *
     * @param accessToken
     * @param groupName
     * @throws IOException
     * @throws URISyntaxException
     */
    public static void createGroup(String accessToken, String groupName) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/cgi-bin/groups/create?access_token=" + accessToken;
        String json = "{\"group\":{\"name\":\"" + groupName + "\"}}";
        System.out.println(json);
        JSONObject jsonObject = JSONObject.fromObject(json);
        HttpEntity entity = HttpUtil.postJson(null, url, jsonObject);
        System.out.println(HttpUtil.entityToString(entity));
    }

    /**
     * 获取用户分组信息
     *
     * @param accessToken
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String userGroupInfo(String accessToken) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/cgi-bin/groups/get?access_token=" + accessToken;
        HttpEntity entity = HttpUtil.get(null, url);
        return HttpUtil.entityToString(entity);
    }

    /**
     * 根据用户的openid查询用户的groupid
     *
     * @param accessToken
     * @param openId
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String groupIdByOpenId(String accessToken, String openId) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/cgi-bin/groups/getid?access_token=" + accessToken;
        String json = "{\"openid\":\"" + openId + "\"}";
        HttpEntity entity = HttpUtil.postJson(null, url, JSONObject.fromObject(json));
        return HttpUtil.entityToString(entity);
    }

    /**
     * 修改组名称
     *
     * @param accessToken
     * @param group
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String updateGroupName(String accessToken, Group group) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/cgi-bin/groups/update?access_token=" + accessToken;
        JSONObject jsonObject = JSONObject.fromObject(group);
        HttpEntity entity = HttpUtil.postJson(null, url, jsonObject);
        return HttpUtil.entityToString(entity);
    }

    /**
     * 根据用户的openid移动用户到其他分组
     *
     * @param accessToken
     * @param openId
     * @param groupid
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String moveUserToOtherGroup(String accessToken, String openId, long groupid) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/cgi-bin/groups/members/update?access_token=" + accessToken;
        String json = "{\"openid\":\"" + openId + "\",\"to_groupid\":" + groupid + "}";
        JSONObject jsonObject = JSONObject.fromObject(json);
        HttpEntity entity = HttpUtil.postJson(null, url, jsonObject);
        return HttpUtil.entityToString(entity);
    }

    /**
     * 根据组id删除分组
     * @param accessToken
     * @param groupid
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String deleteGroup(String accessToken,long groupid) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/cgi-bin/groups/delete?access_token=" + accessToken;
        String json = "{\"group\":{\"id\":"+groupid+"}}";
        System.out.println(json);
        JSONObject jsonObject = JSONObject.fromObject(json);
        HttpEntity entity = HttpUtil.postJson(null, url, jsonObject);
        return HttpUtil.entityToString(entity);
    }

    /**
     * 设置用户备注名
     * @param accessToken
     * @param openId
     * @param remark
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String remarkUser(String accessToken,String openId,String remark) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/cgi-bin/user/info/updateremark?access_token=" + accessToken;
        String json = "{\"openid\": \""+openId+"\",\"remark\": \""+remark+"\"}";
        JSONObject jsonObject = JSONObject.fromObject(json);
        HttpEntity entity = HttpUtil.postJson(null, url, jsonObject);
        return HttpUtil.entityToString(entity);
    }



    public static void main(String[] args) throws IOException, URISyntaxException {
        String appid = "wxeb0835681c3e48b5";
        String appSecret = "8d7b7aeebc5d9ab2a6b2c3f333f3eba1";
        String accessToken = AccessTokenUtil.accessToken(appid, appSecret);

//        UserManageUtil.createGroup(accessToken,"白名单");
//        UserManageUtil.userGroupInfo(accessToken);
//        System.out.println(UserManageUtil.groupIdByOpenId(accessToken,"294284284028402304"));

//        Group group = new Group();
//        group.setName("你好");
//        group.setId(1);
//        UserManageUtil.updateGroupName(accessToken, group);

//        System.out.println(UserManageUtil.moveUserToOtherGroup(accessToken,"$@412412421412",213));
//        System.out.println(UserManageUtil.deleteGroup(accessToken,213));
//        System.out.println(UserManageUtil.remarkUser(accessToken,"123232","nihao "));


    }
}