package cn.cust.wpc.javaee.designpattern.abstractfactory;

/**
 * 抽象工厂类
 * 有N个产品族，在抽象工厂类中就应该有N个创建方法
 * 有N个产品等级就应该有N个实现工厂类，在每个实现工厂中，实现不同产品族的生产任务
 *
 * @author: pengcheng.wang
 * @since: 16/1/4 上午11:36
 */
public abstract class AbstractCreator {
    //创建A产品家族
    public abstract AbstractProductA createProductA();

    //创建B产品家族
    public abstract AbstractProductB createProductB();
}