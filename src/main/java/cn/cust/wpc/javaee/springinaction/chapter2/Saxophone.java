package cn.cust.wpc.javaee.springinaction.chapter2;

/**
 * @author: pengcheng.wang
 * @since: 16/1/7 下午10:16
 */
public class Saxophone implements Instrument {
    public Saxophone() {
    }

    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT");
    }
}