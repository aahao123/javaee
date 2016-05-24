package cn.cust.wpc.javaee.bcsx.generics;

/**
 * @ClassName: Holder3
 * @Description:
 * @author: 王大鸟
 * @date: 2016/5/24
 */
public class Holder3<T> {
    private T t;

    public Holder3(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args){
        Holder3<Automobile> holder3 = new Holder3<>(new Automobile());
        Automobile automobile = holder3.getT();
    }
}

class Automobile{

}
