package cn.cust.wpc.javaee.springinaction.chapter2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: pengcheng.wang
 * @since: 16/1/6 下午5:42
 */
public class Test {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/chapter2/chapter2.xml");
        Performer performer = (Performer) applicationContext.getBean("duke");
        performer.perform();
    }
}