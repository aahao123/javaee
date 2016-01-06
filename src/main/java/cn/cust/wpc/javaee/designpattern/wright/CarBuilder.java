package cn.cust.wpc.javaee.designpattern.wright;

import java.util.ArrayList;

/**
 * 抽象汽车组装者
 *
 * @author: pengcheng.wang
 * @since: 16/1/6 下午9:56
 */
public abstract class CarBuilder {
    //    建造一个模型，你要给我一个顺序，就是组装顺序
    public abstract void setSequence(ArrayList<String> sequence);

    //    设置完毕顺序后，就可以直接拿到这个车辆模型
    public abstract CarModel getCarModel();
}