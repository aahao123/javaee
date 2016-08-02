package cn.cust.wpc.javaee.designpattern.observerpattern.common;

/**
 * @ClassName: ConcreteObserve
 * @Description: 具体观察者
 * @author: 王鹏程
 * @date: 2016/8/2
 */
public class ConcreteObserve implements Observer {
    /**
     * 实现更新方法
     */
    @Override
    public void update() {
        System.out.println("接收到消息，并进行处理...");
    }
}
