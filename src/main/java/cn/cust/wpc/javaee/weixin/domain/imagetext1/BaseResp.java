package cn.cust.wpc.javaee.weixin.domain.imagetext1;

/**
 * Created by wpc on 15/12/18.
 */
public class BaseResp {
    private int ret;
    private String err_msg;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getErr_msg() {
        return err_msg;
    }

    public void setErr_msg(String err_msg) {
        this.err_msg = err_msg;
    }

    @Override
    public String toString() {
        return "BaseResp{" +
                "ret=" + ret +
                ", err_msg='" + err_msg + '\'' +
                '}';
    }
}