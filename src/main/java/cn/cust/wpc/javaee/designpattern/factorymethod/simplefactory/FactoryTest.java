package cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory;

/**
 * Created by wpc on 15/12/21.
 */
public class FactoryTest {
    public static void main(String[] args){
        SimpleFactory simpleFactory = new SimpleFactory();
        Sender sender = simpleFactory.produce("sms");
        sender.send();
    }
}