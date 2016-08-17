package cn.cust.wpc.javaee.designpattern.bridgemodel;

/**
 * @ClassName: Client
 * @Description: 桥梁模式-场景类
 * @author: 王鹏程
 * @date: 2016/8/15
 */
public class Client {
    public static void main(String[] args) {
        House house = new House();

        System.out.println("------房地产公司是这样运行的------");
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();
        System.out.println("\n");

        System.out.println("------山寨公司是这样运行的------");
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
        shanZhaiCorp.makeMoney();

    }
}
