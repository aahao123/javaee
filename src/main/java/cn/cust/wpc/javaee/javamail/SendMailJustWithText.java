package cn.cust.wpc.javaee.javamail;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by wpc on 15/12/9.
 */
public class SendMailJustWithText {

    public void sendMail() throws MessagingException {
        Properties properties = new Properties();
        properties.put("mail.host", "smtp.163.com");
        properties.put("mail.transport.protocol", "smtp");
        properties.put("mail.smtp.auth", "true");

        //1.创建Session
        Session session = Session.getInstance(properties);
        //开启Session的debug模式，这样就可以查看程序发送eamil的运行状态
        session.setDebug(true);
        //2.通过session得到
        Transport transport = session.getTransport();
        //3.使用邮箱的用户名和密码连上邮件服务器，
        transport.connect("smtp.163.com", "wangdaniao1025@163.com", "131452100DN");
        //4.创建邮件
        Message message = createSimplemessage(session);
        //5.发送邮件
        transport.sendMessage(message,message.getAllRecipients());
        transport.close();
    }

    /**
     * 创建一封只包含文本的邮件
     * @param session
     * @return
     * @throws MessagingException
     */
    public Message createSimplemessage(Session session) throws MessagingException {
        //创建邮件对象
        MimeMessage message = new MimeMessage(session);
        //指明邮件的发件人
        message.setFrom(new InternetAddress("wangdaniao1025@163.com"));
        //指明邮件的收件人
        message.setRecipients(Message.RecipientType.TO,"1195746619@qq.com");
        //邮件的标题
        message.setSubject("只包含文本的简单邮件");
        //邮件的文本内容
        message.setContent("<h1>我是谁！</h1>","text/html;charset=UTF-8");
        //返回创建好的邮件对象
        return message;
    }

    public static void main(String[] args) throws MessagingException {
        new SendMailJustWithText().sendMail();
    }
}
