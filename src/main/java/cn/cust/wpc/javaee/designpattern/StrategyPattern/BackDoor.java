package cn.cust.wpc.javaee.designpattern.StrategyPattern;

/**
 * Created by 王大鸟 on 2016/3/31.
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
