package cn.cust.wpc.javaee.designpattern.wright;

import java.util.ArrayList;

/**
 * 导演类
 *
 * @author: pengcheng.wang
 * @since: 16/1/6 下午10:08
 */
public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    /**
     * A类型的奔驰车，先start，然后stop，没有引擎，喇叭
     */
    public BenzModel getABenzModel() {
        //  清理场景，这里是一些初级程序员不注意的地方
        this.sequence.clear();
        //  ABenzModel的执行顺序
        this.sequence.add("start");
        this.sequence.add("stop");
        //  按照顺序返回一个奔驰车
        this.benzBuilder.setSequence(sequence);
        return (BenzModel) benzBuilder.getCarModel();
    }

    /**
     * B类型的奔驰车，要先发动引擎，然后start，然后stop，没有喇叭
     */
    public BenzModel getBBenzModel() {
        //  清理场景，这里是一些初级程序员不注意的地方
        this.sequence.clear();
        //  ABenzModel的执行顺序
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        //  按照顺序返回一个奔驰车
        this.benzBuilder.setSequence(sequence);
        return (BenzModel) benzBuilder.getCarModel();
    }

    /**
     * C类型的宝马车先按下喇叭，然后启动，然后停止
     */
    public BMWModel getCBMWModel() {
        //  清理场景，这里是一些初级程序员不注意的地方
        this.sequence.clear();
        //  ABenzModel的执行顺序
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        //  按照顺序返回一个奔驰车
        this.bmwBuilder.setSequence(sequence);
        return (BMWModel) bmwBuilder.getCarModel();
    }

    /**
     * 之后可能还会由很多方法
     */
}