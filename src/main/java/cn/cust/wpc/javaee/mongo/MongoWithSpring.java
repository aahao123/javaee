package cn.cust.wpc.javaee.mongo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * @author: pengcheng.wang
 * @since: 16/3/1 下午9:48
 */
public class MongoWithSpring {

    private MongoTemplate mongoTemplate;
    public void init(){
        System.out.println("开始启动");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/chapter2/mongodb-spring.xml");
        mongoTemplate = (MongoTemplate) applicationContext.getBean("mongoTemplate");
        System.out.println(mongoTemplate==null);
    }

    public static void main(String[] args){
        new MongoWithSpring().init();
    }
}