package cn.cust.wpc.javaee.weixin.domain.card;

/**
 * 更新会员卡的json封装实体类
 * Created by wpc on 15/12/25.
 */
public class UpdateMemberCardJSON {
    private String code;
    private String card_id;
    private String record_bonus;
    private long add_bonus;
    private long add_balance;
    private String record_balance;
    private String custom_field_value1;
    private String custom_field_value2;
    private String custom_field_value3;

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

    public String getRecord_bonus() {
        return record_bonus;
    }

    public void setRecord_bonus(String record_bonus) {
        this.record_bonus = record_bonus;
    }

    public long getAdd_bonus() {
        return add_bonus;
    }

    public void setAdd_bonus(long add_bonus) {
        this.add_bonus = add_bonus;
    }

    public long getAdd_balance() {
        return add_balance;
    }

    public void setAdd_balance(long add_balance) {
        this.add_balance = add_balance;
    }

    public String getRecord_balance() {
        return record_balance;
    }

    public void setRecord_balance(String record_balance) {
        this.record_balance = record_balance;
    }

    public String getCustom_field_value1() {
        return custom_field_value1;
    }

    public void setCustom_field_value1(String custom_field_value1) {
        this.custom_field_value1 = custom_field_value1;
    }

    public String getCustom_field_value2() {
        return custom_field_value2;
    }

    public void setCustom_field_value2(String custom_field_value2) {
        this.custom_field_value2 = custom_field_value2;
    }

    public String getCustom_field_value3() {
        return custom_field_value3;
    }

    public void setCustom_field_value3(String custom_field_value3) {
        this.custom_field_value3 = custom_field_value3;
    }
}