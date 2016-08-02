package cn.cust.wpc.javaee.designpattern.observerpattern.common;

/**
 * @ClassName: Client
 * @Description:
 * @author: 王大鸟
 * @date: 2016/8/2
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        Observer observer = new ConcreteObserve();
        concreteSubject.addObserver(observer);
        concreteSubject.doSomething();
    }
}
