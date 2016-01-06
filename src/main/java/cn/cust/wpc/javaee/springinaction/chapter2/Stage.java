package cn.cust.wpc.javaee.springinaction.chapter2;

/**
 * 单例
 * @author: pengcheng.wang
 * @since: 16/1/6 下午6:07
 */
public class Stage {
    private Stage() {

    }

    private static class StageSingletonHolder {
        static Stage stage = new Stage();
    }

    public static Stage getInstance() {
        return StageSingletonHolder.stage;
    }
}