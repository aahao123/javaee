package cn.cust.wpc.javaee.springinaction.chapter2;

/**
 * @author: pengcheng.wang
 * @since: 16/1/6 下午5:41
 */
public class Juggler implements Performer {

    private int beanBags = 3;

    public Juggler() {

    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() {
        System.out.println("杂技师可以抛" + beanBags + "个豆子");
    }
}