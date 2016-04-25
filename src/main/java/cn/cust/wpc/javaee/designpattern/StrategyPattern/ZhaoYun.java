package cn.cust.wpc.javaee.designpattern.StrategyPattern;

/**
 * Created by 王大鸟 on 2016/3/31.
 */
public class ZhaoYun {
    public static void main(String[] args){
        Context context;
        //刚刚到吴国的时候拆开第一个
        System.out.println("---刚刚到吴国的时候拆开第一个---");
        context = new Context(new BackDoor());//拿到妙计
        context.operate();//拆开执行
        //刘备乐不思蜀了，拆开第二个了
        System.out.println("---刘备乐不思蜀了，拆第二个了---");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("---孙权的小兵追了，咋办？拆第三个---");
        context = new Context(new BlockEnemy());
        context.operate();
    }
}
