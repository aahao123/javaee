package cn.cust.wpc.javaee.designpattern.wright;

import java.util.ArrayList;

/**
 * 修改后的场景类
 *
 * @author: pengcheng.wang
 * @since: 16/1/6 下午10:01
 */
public class Client2 {
    public static void main(String[] args) {
        /**
         * 客户告诉xx公司，我要这样一个模型，然后xx公司就告诉我们老大
         * 说要这样一个模型，这样一个顺序，然后我就制造
         */
        //  存放run的顺序
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");

        //  要一个奔驰车
        BenzBuilder benzBuilder = new BenzBuilder();
        //  把顺序给这个builder类，制造出这样一个车出来
        benzBuilder.setSequence(sequence);
        //  制造出这样一个奔驰车
        BenzModel benzModel = (BenzModel) benzBuilder.getCarModel();
        //  奔驰车跑一下看看
        benzModel.run();

    }
}