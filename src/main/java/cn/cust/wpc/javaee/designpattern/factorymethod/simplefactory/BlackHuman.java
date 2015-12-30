package cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory;

/**
 * 黑人
 * @author: wpc
 * @since: 15/12/30 下午6:20
 */
public class BlackHuman implements Human {


    @Override
    public void getColor() {
        System.out.println("黑色人中的皮肤颜色是黑色的");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话，一般听不懂");
    }
}