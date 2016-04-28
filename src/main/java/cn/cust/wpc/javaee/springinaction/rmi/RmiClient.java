package cn.cust.wpc.javaee.springinaction.rmi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: RmiClient
 * @Description:
 * @author: 王大鸟
 * @date: 2016/4/28
 */
public class RmiClient {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/chapter2/rmi-client.xml");
        RmiService rmiService = (RmiService) context.getBean("rmiServiceProxy");
        System.out.println(rmiService.doWork());
        System.out.println(rmiService.add(1,2));
    }
}
