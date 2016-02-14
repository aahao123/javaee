package cn.cust.wpc.javaee.designpattern.prototype;

/**
 * @author: pengcheng.wang
 * @since: 16/2/14 下午10:24
 * 原型模式
 * 广告信模版类
 */
public class AdvTemplate {
    //  广告信名称
    private String advSubject = "XX银行国庆信用卡抽奖活动...";
    //  广告信内容
    private String advContext = "国庆抽奖活动通知：只要刷卡就送你一百万...";

    public String getAdvSubject() {
        return advSubject;
    }

    public String getAdvContext() {
        return advContext;
    }
}