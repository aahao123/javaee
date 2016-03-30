package cn.cust.wpc.javaee.designpattern.chainOfResponsibility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by 王大鸟 on 2016/3/29.
 */
public class Client {
    public static void main(String[] args){
        //随机挑选几个女性
        Random random = new Random();
        ArrayList<IWoman> arrayList = new ArrayList<>();
        for(int i=0;i<5;i++){
            arrayList.add(new Woman(random.nextInt(4),"我要出去逛街"));
        }
        //定义三个请示对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        //设置请求顺序
        father.setNext(husband);
        husband.setNext(son);
        for(IWoman woman : arrayList){
            father.handleMessage(woman);
        }
    }

}
