package cn.cust.wpc.javaee.bcsx.enumdemo;

import java.util.EnumMap;
import java.util.Map;

import static cn.cust.wpc.javaee.bcsx.enumdemo.AlarmPoints.*;

/**
 * @ClassName: Demo8
 * @Description:
 * @author: 王大鸟
 * @date: 2016/4/28
 */
public class Demo8 {
    public static void main(String[] args){
        EnumMap<AlarmPoints,Command> em = new EnumMap<AlarmPoints, Command>(AlarmPoints.class);
        em.put(KITCHEN, new Command() {
            @Override
            public void action() {
                System.out.println("Kitchen fire...");
            }
        });
        em.put(BATHROOM, new Command() {
            @Override
            public void action() {
                System.out.println("Bathroom fire...");
            }
        });
        for(Map.Entry<AlarmPoints,Command> e : em.entrySet()){
            System.out.println(e.getKey()+":");
            e.getValue().action();
        }
        try{
            em.get(UTLITY).action();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

interface Command{
    void action();
}
