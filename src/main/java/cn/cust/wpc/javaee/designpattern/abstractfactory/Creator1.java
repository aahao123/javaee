package cn.cust.wpc.javaee.designpattern.abstractfactory;

/**
 * 产品等级1的实现类
 *
 * @author: pengcheng.wang
 * @since: 16/1/4 上午11:40
 */
public class Creator1 extends AbstractCreator {
    //只生产产品等级为1的A产品
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    //只生产产品等级为1的A产品
    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}