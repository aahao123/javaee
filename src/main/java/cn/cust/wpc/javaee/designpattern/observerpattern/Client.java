package cn.cust.wpc.javaee.designpattern.observerpattern;

/**
 * @ClassName: Client
 * @Description: 场景类
 * @author: 王鹏程
 * @date: 2016/8/2
 */
public class Client {
    public static void main(String[] args) {
        //三个观察者产生出来
        Observer liSi = new LiSi();
        Observer wangSi = new WangSi();
        Observer liuSi = new LiuSi();

        //定义出来韩非子
        HanFeiZi hanFeiZi = new HanFeiZi();

        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(liuSi);

        hanFeiZi.haveBreakfast();
    }
}
