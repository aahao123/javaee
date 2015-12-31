package cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory;

/**
 * 抽象工厂类
 * @author: wpc
 * @since: 15/12/31 上午10:30
 */
public abstract class Crator {
    /**
     * 创建一个产品对象，其输入类型参数可以自行设置
     * 通常为String、Enum、Class等，当然也可以为空
     */
    public abstract <T extends Product> T createProduct(Class<T> c);
}