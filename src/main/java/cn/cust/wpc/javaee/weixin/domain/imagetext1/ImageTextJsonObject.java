package cn.cust.wpc.javaee.weixin.domain.imagetext1;

/**
 * Created by wpc on 15/12/18.
 */
public class ImageTextJsonObject {
    private BaseResp base_resp;
    private AppMsgInfo app_msg_info;

    public BaseResp getBase_resp() {
        return base_resp;
    }

    public void setBase_resp(BaseResp base_resp) {
        this.base_resp = base_resp;
    }

    public AppMsgInfo getApp_msg_info() {
        return app_msg_info;
    }

    public void setApp_msg_info(AppMsgInfo app_msg_info) {
        this.app_msg_info = app_msg_info;
    }

    @Override
    public String toString() {
        return "ImageTextJsonObject{" +
                "base_resp=" + base_resp +
                ", app_msg_info=" + app_msg_info +
                '}';
    }
}