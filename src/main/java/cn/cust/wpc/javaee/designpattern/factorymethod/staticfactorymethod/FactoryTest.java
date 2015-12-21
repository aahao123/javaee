package cn.cust.wpc.javaee.designpattern.factorymethod.staticfactorymethod;

import cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory.Sender;

/**
 * Created by wpc on 15/12/21.
 */
public class FactoryTest {
    public static void main(String[] args){
        Sender sender = StaticFactoryMethod.produceMail();
        sender.send();
    }
}