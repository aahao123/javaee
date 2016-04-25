package cn.cust.wpc.javaee.designpattern.StrategyPattern;

/**
 * Created by 王大鸟 on 2016/3/31.
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
