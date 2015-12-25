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
     * @param groupName
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String createGroup(String groupName) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/cgi-bin/groups/create?access_token=" + AccessTokenFactory.getInstance().accessToken();
        String json = "{\"group\":{\"name\":\"" + groupName + "\"}}";
        System.out.println(json);
        JSONObject jsonObject = JSONObject.fromObject(json);
        HttpEntity entity = HttpUtil.postJson(null, url, jsonObject);
        return HttpUtil.entityToString(entity);
    }

    /**
     * 获取用户分组信息
     *
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String userGroupInfo() throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/cgi-bin/groups/get?access_token=" + AccessTokenFactory.getInstance().accessToken();
        HttpEntity entity = HttpUtil.get(null, url);
        return HttpUtil.entityToString(entity);
    }

    /**
     * 根据用户的openid查询用户的groupid
     *
     * @param openId
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String groupIdByOpenId(String openId) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/cgi-bin/groups/getid?access_token=" + AccessTokenFactory.getInstance().accessToken();
        String json = "{\"openid\":\"" + openId + "\"}";
        HttpEntity entity = HttpUtil.postJson(null, url, JSONObject.fromObject(json));
        return HttpUtil.entityToString(entity);
    }

    /**
     * 修改组名称
     *
     * @param group
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String updateGroupName(Group group) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/cgi-bin/groups/update?access_token=" + AccessTokenFactory.getInstance().accessToken();
        JSONObject jsonObject = JSONObject.fromObject(group);
        HttpEntity entity = HttpUtil.postJson(null, url, jsonObject);
        return HttpUtil.entityToString(entity);
    }

    /**
     * 根据用户的openid移动用户到其他分组
     *
     * @param openId
     * @param groupid
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String moveUserToOtherGroup(String openId, long groupid) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/cgi-bin/groups/members/update?access_token=" + AccessTokenFactory.getInstance().accessToken();
        String json = "{\"openid\":\"" + openId + "\",\"to_groupid\":" + groupid + "}";
        JSONObject jsonObject = JSONObject.fromObject(json);
        HttpEntity entity = HttpUtil.postJson(null, url, jsonObject);
        return HttpUtil.entityToString(entity);
    }

    /**
     * 根据组id删除分组
     *
     * @param groupid
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String deleteGroup(long groupid) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/cgi-bin/groups/delete?access_token=" + AccessTokenFactory.getInstance().accessToken();
        String json = "{\"group\":{\"id\":" + groupid + "}}";
        System.out.println(json);
        JSONObject jsonObject = JSONObject.fromObject(json);
        HttpEntity entity = HttpUtil.postJson(null, url, jsonObject);
        return HttpUtil.entityToString(entity);
    }

    /**
     * 设置用户备注名
     *
     * @param openId
     * @param remark
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String remarkUser(String openId, String remark) throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/cgi-bin/user/info/updateremark?access_token=" + AccessTokenFactory.getInstance().accessToken();
        String json = "{\"openid\": \"" + openId + "\",\"remark\": \"" + remark + "\"}";
        JSONObject jsonObject = JSONObject.fromObject(json);
        HttpEntity entity = HttpUtil.postJson(null, url, jsonObject);
        return HttpUtil.entityToString(entity);
    }
}