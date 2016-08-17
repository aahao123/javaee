package cn.cust.wpc.javaee.designpattern.bridgemodel.common;

/**
 * @ClassName: ConcreteImplementor1
 * @Description: 桥梁模式-通用代码-具体实现化角色
 * @author: 王鹏程
 * @date: 2016/8/15
 */
public class ConcreteImplementor1 implements Implementor {
    @Override
    public void doSomething() {
        //业务逻辑处理
    }

    @Override
    public void doAnything() {
        //业务逻辑处理
    }
}
