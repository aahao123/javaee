package cn.cust.wpc.javaee.designpattern.prototype;

/**
 * @author: pengcheng.wang
 * @since: 16/2/14 下午10:27
 * 原型模式
 * 邮件类代码
 */
public class Mail implements Cloneable {
    //  收件人
    private String receiver;
    //  邮件名称
    private String subject;
    //  称谓
    private String application;
    //  邮件内容
    private String context;
    //  邮件的尾部，一般都是加上"XXX版权所有"等信息
    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.subject = advTemplate.getAdvSubject();
        this.context = advTemplate.getAdvContext();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    @Override
    protected Mail clone(){
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }
}