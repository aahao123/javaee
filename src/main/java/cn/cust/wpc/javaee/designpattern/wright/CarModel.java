package cn.cust.wpc.javaee.designpattern.wright;

import java.util.ArrayList;

/**
 * 车辆模型的抽象类
 *
 * @author: pengcheng.wang
 * @since: 16/1/6 下午9:39
 */
public abstract class CarModel {
    //    这个参数是各个基本方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<>();

    //    模型是启动开始跑了
    protected abstract void start();

    //    能发动，还要能停下来，那才是真本事
    protected abstract void stop();

    //  喇叭会发出声音，是滴滴叫，还是哔哔叫
    protected abstract void alarm();

    //    引擎会轰隆隆的响，不响那是假的
    protected abstract void engineBoom();

    public final void run() {
        //  循环一遍，谁在前，就先执行谁
        for (int i = 0; i < sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if (actionName.equalsIgnoreCase("start")) {
                this.start();
            } else if (actionName.equalsIgnoreCase("stop")) {
                this.stop();
            } else if (actionName.equalsIgnoreCase("alarm")) {
                this.alarm();
            } else if (actionName.equalsIgnoreCase("engine boom")) {
                this.engineBoom();
            }
        }
    }

    public final void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }

}