package cn.cust.wpc.javaee.bcsx.enumdemo;

import java.util.EnumSet;
import static cn.cust.wpc.javaee.bcsx.enumdemo.AlarmPoints.*;

/**
 * @ClassName: Demo7
 * @Description:
 * @author: 王大鸟
 * @date: 2016/4/27
 */
public class Demo7 {
    public static void  main(String[] args){
        EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);
        System.out.println(points);
        points.add(BATHROOM);
        System.out.println(points);
        points.addAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
        System.out.println(points);
        points = EnumSet.allOf(AlarmPoints.class);
        System.out.println(points);
        points.removeAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
        System.out.println(points);
        points.removeAll(EnumSet.of(OFFICE1,OFFICE4));
        System.out.println(points);
        points = EnumSet.complementOf(points);
        System.out.println(points);
    }
}

