package cn.cust.wpc.javaee.designpattern.chainOfResponsibility.common;

/**
 * Created by 王大鸟 on 2016/3/30.
 */
public class ConcretHandler2 extends Handler {

    //设置自己的处理级别
    @Override
    protected Level getHandlerLevel() {
        return null;
    }

    //定义自己的处理逻辑
    @Override
    protected Response echo(Request requet) {
        //完成处理逻辑
        return null;
    }
}
