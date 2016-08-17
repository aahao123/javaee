package cn.cust.wpc.javaee.designpattern.bridgemodel.common;

/**
 * @ClassName: Client
 * @Description: 桥梁模式-通用代码-场景类
 * @author: 王鹏程
 * @date: 2016/8/15
 */
public class Client {
    public static void main(String[] args) {
        //定义一个实现化角色
        Implementor implementor = new ConcreteImplementor1();
        //定义一个抽象化角色
        Abstraction abstraction = new RefinedAbstraction(implementor);
        //执行
        abstraction.request();
    }
}
