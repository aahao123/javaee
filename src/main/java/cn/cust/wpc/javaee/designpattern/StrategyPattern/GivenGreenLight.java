package cn.cust.wpc.javaee.designpattern.StrategyPattern;

/**
 * Created by 王大鸟 on 2016/3/31.
 */
public class GivenGreenLight implements IStrategy{

    @Override
    public void operate() {
        System.out.println("求吴老太开绿灯，放行!");
    }
}
