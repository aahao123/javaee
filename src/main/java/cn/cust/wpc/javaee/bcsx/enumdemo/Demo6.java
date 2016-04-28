package cn.cust.wpc.javaee.bcsx.enumdemo;

/**
 * @ClassName: Demo6
 * @Description:
 * @author: 王大鸟
 * @date: 2016/4/27
 */
public class Demo6 {
    public static void main(String[] args) {
        Search[] vals = Search.values();
        Enum e = Search.HITHER;
        for (Enum en : e.getClass().getEnumConstants()) {
            System.out.println(en);
        }
    }
}

enum Search {
    HITHER, YON
}
