package cn.cust.wpc.javaee.designpattern.chainOfResponsibility;

/**
 * Created by 王大鸟 on 2016/3/29.
 */
public class Father extends Handler {

    //父亲只处理女儿的请求
    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    /**
     * 父亲只处理女儿的答复
     * @param woman
     */
    @Override
    public void response(IWoman woman) {
        System.out.println("--------女儿向父亲请示--------");
        System.out.println(woman.getRequest());
        System.out.println("父亲的答复是:同意\n");
    }
}
