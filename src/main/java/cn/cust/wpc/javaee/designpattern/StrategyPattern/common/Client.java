package cn.cust.wpc.javaee.designpattern.StrategyPattern.common;

/**
 * 高层模块
 * Created by 王大鸟 on 2016/3/31.
 */
public class Client {
    public static void main(String[] args){
        //声明一个具体的策略
        Strategy strategy = new ConcreteStrategy1();
        //声明上下文对象
        Context context = new Context(strategy);
        //执行封装后的方法
        context.doAnything();
    }
}
