package cn.cust.wpc.javaee.designpattern.observerpattern;

/**
 * @ClassName: LiSi
 * @Description: 观察者具体实现
 * @author: 王鹏程
 * @date: 2016/8/2
 */
public class LiSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("李斯:观察到韩非子活动，开始向老板汇报了....");
        this.reportToQinShiHuang(context);
        System.out.println("李斯:汇报完毕");
    }

    /**
     * 汇报给秦始皇
     *
     * @param reportContext
     */
    private void reportToQinShiHuang(String reportContext) {
        System.out.println("李斯:报告老板，韩非子有活动了-->" + reportContext);
    }
}
