package cn.cust.wpc.javaee.weixin.domain.card;


/**
 * Created by wpc on 15/12/25.
 */
public class CreateMemberCardJSON {
    private BaseInfo base_info;
    private String supply_bonus;
    private boolean supply_balance;
    private String prerogative;
    private boolean auto_activate;
    private CustomField custom_field1;
    private String activate_url;
    private CustomCell custom_cell1;
    private BonusRule bonus_rule;
    private long discount;

    public BaseInfo getBase_info() {
        return base_info;
    }

    public void setBase_info(BaseInfo base_info) {
        this.base_info = base_info;
    }

    public String getSupply_bonus() {
        return supply_bonus;
    }

    public void setSupply_bonus(String supply_bonus) {
        this.supply_bonus = supply_bonus;
    }

    public boolean isSupply_balance() {
        return supply_balance;
    }

    public void setSupply_balance(boolean supply_balance) {
        this.supply_balance = supply_balance;
    }

    public String getPrerogative() {
        return prerogative;
    }

    public void setPrerogative(String prerogative) {
        this.prerogative = prerogative;
    }

    public boolean isAuto_activate() {
        return auto_activate;
    }

    public void setAuto_activate(boolean auto_activate) {
        this.auto_activate = auto_activate;
    }

    public CustomField getCustom_field1() {
        return custom_field1;
    }

    public void setCustom_field1(CustomField custom_field1) {
        this.custom_field1 = custom_field1;
    }

    public String getActivate_url() {
        return activate_url;
    }

    public void setActivate_url(String activate_url) {
        this.activate_url = activate_url;
    }

    public CustomCell getCustom_cell1() {
        return custom_cell1;
    }

    public void setCustom_cell1(CustomCell custom_cell1) {
        this.custom_cell1 = custom_cell1;
    }

    public BonusRule getBonus_rule() {
        return bonus_rule;
    }

    public void setBonus_rule(BonusRule bonus_rule) {
        this.bonus_rule = bonus_rule;
    }

    public long getDiscount() {
        return discount;
    }

    public void setDiscount(long discount) {
        this.discount = discount;
    }
}