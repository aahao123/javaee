package cn.cust.wpc.javaee.weixin.domain.card;

/**
 * 激活会员卡时发送的json数据封装类
 * Created by wpc on 15/12/25.
 */
public class ActivateCardJSON {
    private long init_bonus;
    private long init_balance;
    private String membership_number;
    private String code;
    private String card_id;
    private String init_custom_field_value1;
    private String init_custom_field_value2;
    private String init_custom_field_value3;

    public long getInit_bonus() {
        return init_bonus;
    }

    public void setInit_bonus(long init_bonus) {
        this.init_bonus = init_bonus;
    }

    public long getInit_balance() {
        return init_balance;
    }

    public void setInit_balance(long init_balance) {
        this.init_balance = init_balance;
    }

    public String getMembership_number() {
        return membership_number;
    }

    public void setMembership_number(String membership_number) {
        this.membership_number = membership_number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public String getInit_custom_field_value1() {
        return init_custom_field_value1;
    }

    public void setInit_custom_field_value1(String init_custom_field_value1) {
        this.init_custom_field_value1 = init_custom_field_value1;
    }

    public String getInit_custom_field_value2() {
        return init_custom_field_value2;
    }

    public void setInit_custom_field_value2(String init_custom_field_value2) {
        this.init_custom_field_value2 = init_custom_field_value2;
    }

    public String getInit_custom_field_value3() {
        return init_custom_field_value3;
    }

    public void setInit_custom_field_value3(String init_custom_field_value3) {
        this.init_custom_field_value3 = init_custom_field_value3;
    }
}