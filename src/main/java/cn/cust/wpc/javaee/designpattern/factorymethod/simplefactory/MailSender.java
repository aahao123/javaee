package cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory;

/**
 * Created by wpc on 15/12/21.
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("this is mailsender!");
    }
}