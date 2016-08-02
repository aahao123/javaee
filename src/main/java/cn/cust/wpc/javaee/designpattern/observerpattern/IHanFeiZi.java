package cn.cust.wpc.javaee.designpattern.observerpattern;

/**
 * 被观察者接口
 */
public interface IHanFeiZi {
    /**
     * 韩非子也是人，也要吃早饭
     */
    public void haveBreakfast();

    /**
     * 韩非子也是人，是人就要娱乐活动
     */
    public void haveFun();
}
