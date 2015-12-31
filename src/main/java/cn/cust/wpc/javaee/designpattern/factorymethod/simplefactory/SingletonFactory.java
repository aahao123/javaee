package cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory;

import java.lang.reflect.Constructor;

/**
 * 工厂方法模式的单例
 * @author: wpc
 * @since: 15/12/31 下午2:21
 */
public class SingletonFactory {
    private static Singleton singleton;

    static {
        try {
            Class c1 = Class.forName(Singleton.class.getName());
            //获得无参构造
            Constructor constructor = c1.getDeclaredConstructor();
            //设置无参构造是可访问的
            constructor.setAccessible(true);
            //产生一个实例对象
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            //异常处理
        }
    }

    public static Singleton getSingleton(){
        return singleton;
    }
}