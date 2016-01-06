package cn.cust.wpc.javaee.designpattern.wright.common;

/**
 * 导演类
 *
 * @author: pengcheng.wang
 * @since: 16/1/6 下午10:32
 */
public class Director {
    private Builder builder = new ConcreteProduct();

    //  构建不同的产品
    public Product getAProduct() {
        this.builder.setPart();
        /**
         * 设置不同的零件，产生不同的产品
         */
        return this.builder.buildProduct();
    }
}