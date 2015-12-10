package cn.cust.wpc.javaee.javamail;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by wpc on 15/12/10.
 */
public class SendMailWithImage {
    public void sendMail() throws MessagingException, IOException {
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
        Message message = createImageMail(session);
        //5.发送邮件
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }

    public static MimeMessage createImageMail(Session session) throws MessagingException, IOException {
        MimeMessage mimeMessage = new MimeMessage(session);
        mimeMessage.setFrom(new InternetAddress("wangdaniao1025@163.com"));
        mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress("1195746619@qq.com"));
        mimeMessage.setSubject("带图片的邮件");

        MimeBodyPart text = new MimeBodyPart();
        text.setContent("这是一封邮件正文带图片<img src='cid:img.jpg'></img>的邮件", "text/html;charset=UTF-8");

        MimeBodyPart image = new MimeBodyPart();
        File file = new File("/Users/yp-tc-m-2963/Document/ideaworkspace/daxuetao/WebContent/files/noImg/buyImg.jpg");
        DataHandler dh = new DataHandler(new FileDataSource(file));

        image.setDataHandler(dh);
        image.setContentID("img.jpg");

        MimeMultipart mm = new MimeMultipart();
        mm.addBodyPart(text);
        mm.addBodyPart(image);
        mm.setSubType("related");

        mimeMessage.setContent(mm);
        mimeMessage.saveChanges();
        mimeMessage.writeTo(new FileOutputStream("/Users/yp-tc-m-2963/Downloads/hello.eml"));

        return mimeMessage;
    }

    public static void main(String[] args) throws IOException, MessagingException {
        new SendMailWithImage().sendMail();
    }

}
