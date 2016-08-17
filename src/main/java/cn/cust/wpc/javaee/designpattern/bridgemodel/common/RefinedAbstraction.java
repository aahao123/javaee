package cn.cust.wpc.javaee.designpattern.bridgemodel.common;

/**
 * @ClassName: RefinedAbstraction
 * @Description: 桥梁模式-通用代码-具体抽象化角色
 * @author: 王鹏程
 * @date: 2016/8/15
 */
public class RefinedAbstraction extends Abstraction {
    //覆写构造函数
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void request() {
        //业务处理
        super.request();
        super.getImplementor().doAnything();
    }
}
