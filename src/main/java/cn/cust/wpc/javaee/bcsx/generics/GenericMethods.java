package cn.cust.wpc.javaee.bcsx.generics;

/**
 * @ClassName: GenericMethods
 * @Description:
 * @author: 王大鸟
 * @date: 2016/5/24
 */
public class GenericMethods {
    public <T> void f(T t){
        System.out.println(t.getClass().getName());
    }

    public static void main(String[] args){
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
    }
}
