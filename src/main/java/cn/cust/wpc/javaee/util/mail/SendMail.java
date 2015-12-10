package cn.cust.wpc.javaee.util.mail;

import javax.mail.Address;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by wpc on 15/12/9.
 */
public class SendMail {
    public void sendMail(Mail mail) throws MessagingException {
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.163.com");
        properties.put("mail.smtp.auth", true);

//        基本的邮件回话
        Session session = Session.getInstance(properties);
//        构造信息体
        MimeMessage message = new MimeMessage(session);
//        发件地址
        Address fromAddress = new InternetAddress(mail.getFromAddress());
        message.setFrom(fromAddress);
//        收件地址
        Address toAddress = new InternetAddress(mail.getToAddress());
        message.setRecipient(MimeMessage.RecipientType.TO,toAddress);

//        主题
        message.setSubject(mail.getSubject());
//        正文
        message.setText(mail.getContent());

        message.saveChanges();
        session.setDebug(true);
        Transport transport = session.getTransport("smtp");
        transport.connect("smtp.163.com",mail.getFromAddress(),mail.getPassword());
//        发送
        transport.sendMessage(message,message.getAllRecipients());
        transport.close();
    }

    public static void main(String[] args) throws MessagingException, InterruptedException {
        Mail mail = new Mail();
        mail.setFromAddress("wangdaniao1025@163.com");
        mail.setToAddress("1195746619@qq.com");
        mail.setSubject("这是主题");
        mail.setContent("Hello World!");
        mail.setPassword("************");
        for(int i=0;i<1;i++){
            new SendMail().sendMail(mail);
            Thread.sleep(10000);
            System.out.println("＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋"+i+"＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋");
        }
    }
}
