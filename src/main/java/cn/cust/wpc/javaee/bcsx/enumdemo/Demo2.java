package cn.cust.wpc.javaee.bcsx.enumdemo;

import static cn.cust.wpc.javaee.bcsx.enumdemo.Spiciness.*;

/**
 * @ClassName: Demo2
 * @Description:
 * @author: 王大鸟
 * @date: 2016/4/27
 */
public class Demo2 {
    Spiciness spiciness;

    public Demo2(Spiciness spiciness) {
        this.spiciness = spiciness;
    }

    @Override
    public String toString() {
        return "Demo2{" +
                "spiciness=" + spiciness +
                '}';
    }

    public static void main(String[] args) {
        //使用 static import能够将enum实例的标识符带入当前的命名空间，所以无需再用enum类型来修饰enum实例
        System.out.println(new Demo2(NOT));
        System.out.println(new Demo2(MEDIUM));
        System.out.println(new Demo2(HOT));
    }
}
