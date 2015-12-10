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
    public void sendMail() throws MessagingException {
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.163.com");
        properties.put("mail.smtp.auth", true);

//        基本的邮件回话
        Session session = Session.getInstance(properties);
//        构造信息体
        MimeMessage message = new MimeMessage(session);
//        发件地址
        Address fromAddress = new InternetAddress("wangdaniao1025@163.com");
        message.setFrom(fromAddress);
//        收件地址
        Address toAddress = new InternetAddress("1195746619@qq.com");
        message.setRecipient(MimeMessage.RecipientType.TO,toAddress);

//        主题
        message.setSubject("Hello world");
//        正文
        message.setText("Hello World");

        message.saveChanges();
        session.setDebug(true);
        Transport transport = session.getTransport("smtp");
        transport.connect("smtp.163.com","wangdaniao1025@163.com","131452100DN");
//        发送
        transport.sendMessage(message,message.getAllRecipients());
        transport.close();
    }

    public static void main(String[] args) throws MessagingException {
        for(int i=0;i<100;i++){
            new SendMail().sendMail();
            System.out.println("＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋"+i+"＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋＋");
        }
    }
}
