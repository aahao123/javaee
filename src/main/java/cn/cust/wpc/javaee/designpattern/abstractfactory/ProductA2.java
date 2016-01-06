package cn.cust.wpc.javaee.designpattern.abstractfactory;

/**
 * 产品A2的实现类
 *
 * @author: pengcheng.wang
 * @since: 16/1/4 上午11:32
 */
public class ProductA2 extends AbstractProductA {
    @Override
    public void doSomething() {
        System.out.println("产品A2的实现类");
    }
}