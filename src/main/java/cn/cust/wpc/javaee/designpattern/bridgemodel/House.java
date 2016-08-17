package cn.cust.wpc.javaee.designpattern.bridgemodel;

/**
 * @ClassName: House
 * @Description: 桥梁模式——产品实现类-房子实体类
 * @author: 王鹏程
 * @date: 2016/8/15
 */
public class House extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出来的房子是这样的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出来的房子卖出去了...");
    }
}
