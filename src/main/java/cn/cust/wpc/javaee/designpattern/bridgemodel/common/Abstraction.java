package cn.cust.wpc.javaee.designpattern.bridgemodel.common;

/**
 * @ClassName: Abstraction
 * @Description: 桥梁模式-通用代码-抽象化角色
 * @author: 王鹏程
 * @date: 2016/8/15
 */
public class Abstraction {
    //定义对实现化角色的引用
    private Implementor implementor;

    //约束子类必须实现该构造函数
    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    //自身的行为和属性
    public void request() {
        this.implementor.doSomething();
    }

    //获得实现化角色
    public Implementor getImplementor() {
        return this.implementor;
    }

}
