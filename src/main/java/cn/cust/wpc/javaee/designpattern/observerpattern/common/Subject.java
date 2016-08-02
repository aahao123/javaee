package cn.cust.wpc.javaee.designpattern.observerpattern.common;

import java.util.Vector;

/**
 * @ClassName: Subject
 * @Description: 被观察者
 * @author: 王鹏程
 * @date: 2016/8/2
 */
public abstract class Subject {
    /**
     * 定义一个观察者数组
     */
    private Vector<Observer> observerVector = new Vector<>();

    /**
     * 增加一个观察者
     *
     * @param observer
     */
    public void addObserver(Observer observer) {
        this.observerVector.add(observer);
    }

    /**
     * 删除一个观察者
     *
     * @param observer
     */
    public void deleteObserve(Observer observer) {
        this.observerVector.remove(observer);
    }

    /**
     * 通知所有观察者
     */
    public void notifyObservers() {
        for (Observer observer : observerVector) {
            observer.update();
        }
    }


}
