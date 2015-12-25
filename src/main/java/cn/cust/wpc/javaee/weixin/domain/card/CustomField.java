package cn.cust.wpc.javaee.weixin.domain.card;

/**
 * Created by wpc on 15/12/25.
 */
public class CustomField {
    private String name_type;
    private String url;

    public CustomField(){}

    public CustomField(String name_type, String url) {
        this.name_type = name_type;
        this.url = url;
    }

    public String getName_type() {
        return name_type;
    }

    public void setName_type(String name_type) {
        this.name_type = name_type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}