package cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory;

/**
 * 黄人
 * @author: wpc
 * @since: 15/12/30 下午6:22
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色人中的皮肤颜色是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄人会说话，一般双音节");
    }
}