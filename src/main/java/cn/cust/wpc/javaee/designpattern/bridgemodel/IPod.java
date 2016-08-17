package cn.cust.wpc.javaee.designpattern.bridgemodel;

/**
 * @ClassName: IPod
 * @Description: 桥梁模式-产品实现类-Ipod实体类
 * @author: 王鹏程
 * @date: 2016/8/15
 */
public class IPod extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出的Ipod是这样的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的Ipod卖出去了...");
    }
}
