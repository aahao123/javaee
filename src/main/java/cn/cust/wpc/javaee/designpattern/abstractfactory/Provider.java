package cn.cust.wpc.javaee.designpattern.abstractfactory;

import cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory.Sender;

/**
 * 抽象工厂模式
 *
 * 工厂方法模式中：
 * 类的创建依赖工厂类，如果想要拓展程序，必须对工厂类进行修改，违背了闭包原则
 * 抽象工厂模式中：
 * 如果想增加新的功能，只需要做一个实现类，实现Sender接口，同时做一个工厂类，实现Provider接口，就OK了
 */
public interface Provider {
    public Sender produce();
}