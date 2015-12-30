package cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory;

/**
 * 白人
 * @author: wpc
 * @since: 15/12/30 下午6:24
 */
public class WhiteMan implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人中的皮肤颜色是白色的");
    }

    @Override
    public void talk() {
        System.out.println("白人会说话，一般单音节");
    }
}