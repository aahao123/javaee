package cn.cust.wpc.javaee.weixin.domain.Menu;

/**
 * Created by wpc on 15/12/24.
 */
public class ClickButton extends Button {
    private String key;
    private String type = "click";

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }
}