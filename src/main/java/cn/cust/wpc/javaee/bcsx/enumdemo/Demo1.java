package cn.cust.wpc.javaee.bcsx.enumdemo;

/**
 * @ClassName: Demo1
 * @Description:
 * @author: 王大鸟
 * @date: 2016/4/27
 */
public class Demo1 {
    public static void main(String[] args) {
        for (Shrubbery s : Shrubbery.values()) {
            System.out.println(s);
            //返回一个int值，这是每个enum实例在声明时的次序，从0开始
            System.out.println(s + " ordinal:" + s.ordinal());
            //compareTo方法返回0代表相等，返回-1代表不等
            System.out.println(s.compareTo(Shrubbery.CRAWLING));
            //true相等，false代表不等
            System.out.println(s.equals(Shrubbery.CRAWLING));
            //true相等，false代表不等
            System.out.println(s == Shrubbery.CRAWLING);
            //返回enum实例属于的enum类
            System.out.println(s.getDeclaringClass());
            //返回enum实例声明时的名字
            System.out.println(s.name());
            System.out.println("-----------");
        }
        for (String s : "GROUND CRAWLING HANGING".split(" ")) {
            //valueOf()方法根据给定的名字返回相应的enum实例
            Shrubbery shrubbery = Enum.valueOf(Shrubbery.class, s);
            System.out.println(shrubbery);
        }
    }
}

enum Shrubbery {
    GROUND, CRAWLING, HANGING
}
