package cn.cust.wpc.javaee.designpattern.abstractfactory;

import cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory.MailSender;
import cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory.Sender;

/**
 * Created by wpc on 15/12/21.
 */
public class SendMailFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}