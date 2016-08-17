package cn.cust.wpc.javaee.designpattern.bridgemodel;

/**
 * @ClassName: Corp
 * @Description: 桥梁模式-抽象公司类
 * @author: 王鹏程
 * @date: 2016/8/15
 */
public abstract class Corp {
    private Product product;

    public Corp(Product product) {
        this.product = product;
    }

    public void makeMoney(){
        this.product.beProducted();

        this.product.beSelled();
    }
}
