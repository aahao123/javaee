package cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory;

/**
 * 工厂方法模式第一种
 * 根据传入的字符串判断应该返回哪个实例
 * 倘若字符串传入错误，不能正确创建对象
 */
public class SimpleFactory {
    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else{
            System.out.println("请输入正确的类型");
            return null;
        }
    }
}