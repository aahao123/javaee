package cn.cust.wpc.javaee.designpattern.wright;

import java.util.ArrayList;

/**
 * 宝马车组装者
 *
 * @author: pengcheng.wang
 * @since: 16/1/6 下午10:00
 */
public class BMWBuilder extends CarBuilder {
    private BMWModel bmwModel = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }
}