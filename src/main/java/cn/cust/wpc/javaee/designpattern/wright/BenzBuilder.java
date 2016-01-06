package cn.cust.wpc.javaee.designpattern.wright;

import java.util.ArrayList;

/**
 * 奔驰车组装者
 *
 * @author: pengcheng.wang
 * @since: 16/1/6 下午9:59
 */
public class BenzBuilder extends CarBuilder {
    private BenzModel benzModel = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}