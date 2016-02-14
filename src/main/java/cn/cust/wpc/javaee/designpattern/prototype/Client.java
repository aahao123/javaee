package cn.cust.wpc.javaee.designpattern.prototype;

import java.util.Random;

/**
 * @author: pengcheng.wang
 * @since: 16/2/14 下午10:33
 */
public class Client {
    //  发送账单的数量，这个值是从数据库中得到的
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        //  模拟发送邮件
        int i = 0;
        //  把模版定义出来
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while (i < MAX_COUNT) {
            //  以下是每封邮件的不同之处
            Mail cloneMail = mail.clone();
            mail.setApplication(getRandString(5) + "先生/女士");
            mail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
            //  发送邮件
            sendMail(mail);
            i++;
        }

    }

    public static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t发送成功...");
    }

    //  获得指定长度的随机字符串
    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < maxLength; i++) {
            stringBuffer.append(source.charAt(random.nextInt(source.length())));
        }
        return stringBuffer.toString();
    }
}