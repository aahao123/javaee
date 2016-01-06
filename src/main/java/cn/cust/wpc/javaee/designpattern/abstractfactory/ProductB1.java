package cn.cust.wpc.javaee.designpattern.abstractfactory;

/**
 * 产品B1的实现类
 *
 * @author: pengcheng.wang
 * @since: 16/1/4 上午11:32
 */
public class ProductB1 extends AbstractProductB {
    @Override
    public void doSomething() {
        System.out.println("产品B1的实现类");
    }
}