package cn.cust.wpc.javaee.designpattern.StrategyPattern.common;

/**
 * 具体策略角色
 * Created by 王大鸟 on 2016/3/31.
 */
public class ConcreteStrategy1 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略1的运算法则");
    }
}
