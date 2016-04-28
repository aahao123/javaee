package cn.cust.wpc.javaee.bcsx.enumdemo;

/**
 * @ClassName: Demo5
 * @Description:
 * @author: 王大鸟
 * @date: 2016/4/27
 */
public class Demo5 {
    Signal color = Signal.RED;

    public void change() {
        //使用switch
        switch (color) {
            case RED:
                color = Signal.GREEN;
                break;
            case GREEN:
                color = Signal.YELLOW;
                break;
            case YELLOW:
                color = Signal.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return "Demo5{" +
                "color=" + color +
                '}';
    }

    public static void main(String[] args) {
        Demo5 demo5 = new Demo5();
        for (int i = 0; i < 7; i++) {
            System.out.println(demo5);
            demo5.change();
        }
    }
}

enum Signal {
    GREEN, YELLOW, RED
}
