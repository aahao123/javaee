package cn.cust.wpc.javaee.weixin.domain.Menu;

/**
 * Created by wpc on 15/12/24.
 */
public class ViewButton extends Button {
    private String type = "view";
    private String url;

    public ViewButton() {
    }

    public ViewButton(String name, String url) {
        super(name);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }
}