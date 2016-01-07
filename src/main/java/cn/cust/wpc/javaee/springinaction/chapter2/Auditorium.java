package cn.cust.wpc.javaee.springinaction.chapter2;

/**
 * 表演大厅
 * 初始化需要开灯
 * 销毁需要关灯
 *
 * @author: pengcheng.wang
 * @since: 16/1/6 下午11:26
 */
public class Auditorium {
    public void turnOnLights() {
        System.out.println("所有的灯光都已经打开。。。");
    }

    public void trunOffLights() {
        System.out.println("所有的灯光都已经关闭。。。");
    }
}