package cn.cust.wpc.javaee.designpattern.prototype.common;

/**
 * @author: pengcheng.wang
 * @since: 16/2/14 下午11:19
 */
public class PrototypeClass implements Cloneable {
    //  覆写父类Object方法
    @Override
    protected PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}