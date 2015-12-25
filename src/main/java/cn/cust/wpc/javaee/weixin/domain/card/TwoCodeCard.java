package cn.cust.wpc.javaee.weixin.domain.card;

/**
 * Created by wpc on 15/12/25.
 */
public class TwoCodeCard {
    private String action_name;
    private TwoCodeCardActionInfo action_info;

    public String getAction_name() {
        return action_name;
    }

    public void setAction_name(String action_name) {
        this.action_name = action_name;
    }


    public TwoCodeCardActionInfo getAction_info() {
        return action_info;
    }

    public void setAction_info(TwoCodeCardActionInfo action_info) {
        this.action_info = action_info;
    }
}