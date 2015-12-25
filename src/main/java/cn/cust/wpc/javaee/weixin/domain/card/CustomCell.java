package cn.cust.wpc.javaee.weixin.domain.card;

/**
 * Created by wpc on 15/12/25.
 */
public class CustomCell {
    private String name;
    private String tips;
    private String url;

    public CustomCell(){}

    public CustomCell(String name, String tips, String url) {
        this.name = name;
        this.tips = tips;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}