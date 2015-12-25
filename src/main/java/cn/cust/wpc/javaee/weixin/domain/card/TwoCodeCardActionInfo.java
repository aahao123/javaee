package cn.cust.wpc.javaee.weixin.domain.card;

/**
 * 以二维码形式投放会员卡封装实体类
 */
public class TwoCodeCardActionInfo {
    private String code;
    private String is_unique_code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIs_unique_code() {
        return is_unique_code;
    }

    public void setIs_unique_code(String is_unique_code) {
        this.is_unique_code = is_unique_code;
    }
}