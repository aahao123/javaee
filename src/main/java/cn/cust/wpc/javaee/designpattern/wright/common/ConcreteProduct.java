package cn.cust.wpc.javaee.designpattern.wright.common;

/**
 * 具体建造者
 * 如果有多个产品类，就有多个具体建造者
 *
 * @author: pengcheng.wang
 * @since: 16/1/6 下午10:30
 */
public class ConcreteProduct extends Builder {
    private Product product = new Product();

    //  设置产品零件
    @Override
    public void setPart() {
        /**
         * 产品类内的逻辑处理
         */
    }

    //  组建一个产品
    @Override
    public Product buildProduct() {
        return this.product;
    }
}