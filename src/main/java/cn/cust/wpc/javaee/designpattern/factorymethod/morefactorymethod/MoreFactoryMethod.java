package cn.cust.wpc.javaee.designpattern.factorymethod.morefactorymethod;

import cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory.MailSender;
import cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory.Sender;
import cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory.SmsSender;

/**
 * 多个工厂方法模式
 * 提供多个工厂方法，分别创建对象
 */
public class MoreFactoryMethod {
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}