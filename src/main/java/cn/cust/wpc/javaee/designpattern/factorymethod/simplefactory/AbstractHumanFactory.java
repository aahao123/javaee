package cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory;

/**
 * 抽象人类创建工厂
 *
 * @author: wpc
 * @since: 15/12/30 下午6:28
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> Human createHuman(Class<T> c);
}