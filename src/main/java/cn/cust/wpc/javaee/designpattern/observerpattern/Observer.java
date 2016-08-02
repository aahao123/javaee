package cn.cust.wpc.javaee.designpattern.observerpattern;

/**
 * 观察者接口
 */
public interface Observer {
    /**
     * 一发现别人有动作，自己也要行动起来
     *
     * @param context
     */
    public void update(String context);
}
