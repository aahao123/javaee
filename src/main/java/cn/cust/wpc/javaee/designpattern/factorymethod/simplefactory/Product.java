package cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory;

/**
 * 抽象产品类
 *
 * @author: wpc
 * @since: 15/12/31 上午10:24
 */
public abstract class Product {
    //产品类的公共方法
    public void method1() {
        //业务逻辑处理
    }

    //抽象方法
    public abstract void method2();
}