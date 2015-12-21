package cn.cust.wpc.javaee.designpattern.factorymethod.morefactorymethod;

import cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory.Sender;

/**
 * Created by wpc on 15/12/21.
 */
public class FactoryTest {
    public static void main(String[] args){
        MoreFactoryMethod moreFactoryMethod = new MoreFactoryMethod();
        Sender sender = moreFactoryMethod.produceMail();
        sender.send();

    }
}