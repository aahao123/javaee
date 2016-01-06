package cn.cust.wpc.javaee.designpattern.abstractfactory;

/**
 * 产品等级2的实现类
 *
 * @author: pengcheng.wang
 * @since: 16/1/4 上午11:42
 */
public class Creator2 extends AbstractCreator {
    //只生产产品等级为2的A产品
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    //只生产产品等级为2的B产品
    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}