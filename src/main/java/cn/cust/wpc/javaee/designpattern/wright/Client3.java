package cn.cust.wpc.javaee.designpattern.wright;

/**
 * 增加导演类之后的场景类
 *
 * @author: pengcheng.wang
 * @since: 16/1/6 下午10:15
 */
public class Client3 {
    public static void main(String[] args) {
        Director director = new Director();
        //  A类型的奔驰车
        director.getABenzModel().run();

        //  B类型的奔驰车
        director.getBBenzModel().run();

        //  C类型的宝马车
        director.getCBMWModel().run();
    }
}