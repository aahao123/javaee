package cn.cust.wpc.javaee.designpattern.templatemethod;

/**
 * @author: pengcheng.wang
 * @since: 16/1/5 下午10:16
 */
public abstract class AbstractClass {
    //基本方法
    protected abstract void doSomething();

    //基本方法
    protected abstract void doAnything();

    //模板方法
    public void templateMethod() {
        /**
         * 调用基本方法
         * 完成相关逻辑
         */
        this.doSomething();
        this.doAnything();
    }
}