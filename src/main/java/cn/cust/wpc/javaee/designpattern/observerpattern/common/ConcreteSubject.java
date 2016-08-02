package cn.cust.wpc.javaee.designpattern.observerpattern.common;

/**
 * @ClassName: ConcreteObject
 * @Description: 具体被观察者
 * @author: 王鹏程
 * @date: 2016/8/2
 */
public class ConcreteSubject extends Subject {
    /**
     * 具体的业务
     */
    public void doSomething() {
        /**
         * do something
         */
        super.notifyObservers();
    }
}
