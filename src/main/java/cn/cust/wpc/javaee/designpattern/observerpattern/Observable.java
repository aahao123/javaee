package cn.cust.wpc.javaee.designpattern.observerpattern;

/**
 * 被观察者接口
 */
public interface Observable {
    /**
     * 增加一个观察者
     *
     * @param observer
     */
    public void addObserver(Observer observer);

    /**
     * 删除一个观察者
     *
     * @param observer
     */
    public void deleteObserver(Observer observer);

    /**
     * 既然要观察，我发生了改变他也应该有所动作，通知观察者
     *
     * @param context
     */
    public void notifyObservers(String context);
}
