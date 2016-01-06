package cn.cust.wpc.javaee.designpattern.wright.common;

/**
 * 抽象建造者
 *
 * @author: pengcheng.wang
 * @since: 16/1/6 下午10:29
 */
public abstract class Builder {
    //  设置产品的不同部分，以获得不同的产品
    public abstract void setPart();

    //  建造产品
    public abstract Product buildProduct();
}