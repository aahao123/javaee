package cn.cust.wpc.javaee.designpattern.factorymethod.staticfactorymethod;

import cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory.MailSender;
import cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory.Sender;
import cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory.SmsSender;

/**
 * 静态工厂方法
 * 将方法置为静态的，不需要创建实例，就可以直接调用
 */
public class StaticFactoryMethod {
    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}