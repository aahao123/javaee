package cn.cust.wpc.javaee.designpattern.StrategyPattern.common;

/**
 * 封装角色
 * Created by 王大鸟 on 2016/3/31.
 */
public class Context {
    //抽象策略
    private Strategy strategy;
    //构造函数设置具体策略
    public Context(Strategy _strategy){
        this.strategy = _strategy;
    }
    //封装后的策略方法
    public void doAnything(){
        this.strategy.doSomething();
    }
}
