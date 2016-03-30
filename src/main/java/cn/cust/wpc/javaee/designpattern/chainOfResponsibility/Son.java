package cn.cust.wpc.javaee.designpattern.chainOfResponsibility;

/**
 * Created by 王大鸟 on 2016/3/29.
 */
public class Son extends Handler {
    /**
     * 丈夫只处理妻子的请求
     */
    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    //丈夫请示的答复
    @Override
    public void response(IWoman woman) {
        System.out.println("--------母亲向儿子请示--------");
        System.out.println(woman.getRequest());
        System.out.println("儿子的答复是:同意\n");
    }
}
