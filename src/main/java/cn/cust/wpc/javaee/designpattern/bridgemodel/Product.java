package cn.cust.wpc.javaee.designpattern.bridgemodel;

/**
 * @ClassName: Product
 * @Description: 桥梁模式——产品抽象类
 * @author: 王鹏程
 * @date: 2016/8/15
 */
public abstract class Product {
    /**
     * 生产产品
     */
    public abstract void beProducted();

    /**
     *销售产品
     */
    public abstract void beSelled();
}
