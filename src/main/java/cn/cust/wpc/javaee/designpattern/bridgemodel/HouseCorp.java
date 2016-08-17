package cn.cust.wpc.javaee.designpattern.bridgemodel;

/**
 * @ClassName: HouseCorp
 * @Description: 桥梁模式-房地产公司
 * @author: 王鹏程
 * @date: 2016/8/15
 */
public class HouseCorp extends Corp {

    public HouseCorp(House house) {
        super(house);
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }

}
