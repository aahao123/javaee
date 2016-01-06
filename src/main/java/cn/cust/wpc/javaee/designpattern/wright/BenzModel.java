package cn.cust.wpc.javaee.designpattern.wright;

/**
 * 奔驰模型代码
 *
 * @author: pengcheng.wang
 * @since: 16/1/6 下午9:48
 */
public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("奔驰车跑起来是这个样子的。。。");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车应该这样停车。。。");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车的喇叭声是这个样子的。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车的引擎声是这个样子的。。。");
    }
}