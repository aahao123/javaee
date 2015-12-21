package cn.cust.wpc.javaee.designpattern.abstractfactory;

import cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory.Sender;
import cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory.SmsSender;

/**
 * Created by wpc on 15/12/21.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}