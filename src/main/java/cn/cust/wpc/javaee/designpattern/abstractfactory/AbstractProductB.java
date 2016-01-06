package cn.cust.wpc.javaee.designpattern.abstractfactory;

/**
 * 抽象产品类
 *
 * @author: pengcheng.wang
 * @since: 16/1/4 上午11:29
 */
public abstract class AbstractProductB {
    /**
     * 每个产品共有的方法
     */
    public void shareMethod() {

    }

    /**
     * 每个产品，相同方法，不同实现
     */
    public abstract void doSomething();
}