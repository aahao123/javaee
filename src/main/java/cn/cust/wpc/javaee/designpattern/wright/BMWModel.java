package cn.cust.wpc.javaee.designpattern.wright;

/**
 * 宝马模型代码
 *
 * @author: pengcheng.wang
 * @since: 16/1/6 下午9:50
 */
public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马车跑起来是这个样子的。。。");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车应该这样停车。。。");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车的喇叭声是这个样子的。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车的引擎声是这个样子的。。。");
    }
}