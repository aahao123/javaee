package cn.cust.wpc.javaee.designpattern.bridgemodel;

/**
 * @ClassName: ShanZhaiCorp
 * @Description: 桥梁模式-山寨公司
 * @author: 王鹏程
 * @date: 2016/8/15
 */
public class ShanZhaiCorp extends Corp {

    public ShanZhaiCorp(Product product) {
        super(product);
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱呀...");
    }
}
