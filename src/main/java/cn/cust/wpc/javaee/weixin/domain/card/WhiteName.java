package cn.cust.wpc.javaee.weixin.domain.card;

/**
 * Created by wpc on 15/12/25.
 */
public class WhiteName {
    private String[] openid;
    private String[] username;

    public WhiteName(String[] openid, String[] username) {
        this.openid = openid;
        this.username = username;
    }

    public String[] getOpenid() {
        return openid;
    }

    public void setOpenid(String[] openid) {
        this.openid = openid;
    }

    public String[] getUsername() {
        return username;
    }

    public void setUsername(String[] username) {
        this.username = username;
    }
}