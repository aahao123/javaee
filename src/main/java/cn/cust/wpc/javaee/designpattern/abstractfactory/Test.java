package cn.cust.wpc.javaee.designpattern.abstractfactory;

import cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory.Sender;

/**
 * Created by wpc on 15/12/21.
 */
public class Test {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}