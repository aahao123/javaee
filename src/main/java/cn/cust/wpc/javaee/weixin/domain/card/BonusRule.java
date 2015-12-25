package cn.cust.wpc.javaee.weixin.domain.card;

/**
 * Created by wpc on 15/12/25.
 */
public class BonusRule {
    private long cost_money_unit;
    private long increase_bonus;
    private long max_increase_bonus;
    private long init_increase_bonus;
    private long cost_bonus_unit;
    private long reduce_money;
    private long least_money_to_use_bonus;
    private long max_reduce_bonus;

    public long getCost_money_unit() {
        return cost_money_unit;
    }

    public void setCost_money_unit(long cost_money_unit) {
        this.cost_money_unit = cost_money_unit;
    }

    public long getIncrease_bonus() {
        return increase_bonus;
    }

    public void setIncrease_bonus(long increase_bonus) {
        this.increase_bonus = increase_bonus;
    }

    public long getMax_increase_bonus() {
        return max_increase_bonus;
    }

    public void setMax_increase_bonus(long max_increase_bonus) {
        this.max_increase_bonus = max_increase_bonus;
    }

    public long getInit_increase_bonus() {
        return init_increase_bonus;
    }

    public void setInit_increase_bonus(long init_increase_bonus) {
        this.init_increase_bonus = init_increase_bonus;
    }

    public long getCost_bonus_unit() {
        return cost_bonus_unit;
    }

    public void setCost_bonus_unit(long cost_bonus_unit) {
        this.cost_bonus_unit = cost_bonus_unit;
    }

    public long getReduce_money() {
        return reduce_money;
    }

    public void setReduce_money(long reduce_money) {
        this.reduce_money = reduce_money;
    }

    public long getLeast_money_to_use_bonus() {
        return least_money_to_use_bonus;
    }

    public void setLeast_money_to_use_bonus(long least_money_to_use_bonus) {
        this.least_money_to_use_bonus = least_money_to_use_bonus;
    }

    public long getMax_reduce_bonus() {
        return max_reduce_bonus;
    }

    public void setMax_reduce_bonus(long max_reduce_bonus) {
        this.max_reduce_bonus = max_reduce_bonus;
    }
}