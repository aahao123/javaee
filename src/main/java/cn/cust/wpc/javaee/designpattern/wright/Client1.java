package cn.cust.wpc.javaee.designpattern.wright;

import java.util.ArrayList;

/**
 * 原始场景
 *
 * @author: pengcheng.wang
 * @since: 16/1/6 下午9:52
 */
public class Client1 {
    public static void main(String[] args) {
        /**
         * 客户告诉xx公司，我要这样一个模型，然后xx公司就告诉我们老大
         * 说要这样一个模型，这样一个顺序，然后我就制造
         */
        BenzModel benzModel = new BenzModel();
        //存放run的顺序
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");
        sequence.add("start");
        sequence.add("stop");

        //我们把这个顺序赋予奔驰车
        benzModel.setSequence(sequence);
        benzModel.run();
    }
}