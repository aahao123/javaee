package cn.cust.wpc.javaee.designpattern.chainOfResponsibility.common;

/**
 * Created by 王大鸟 on 2016/3/30.
 */
public class Client {
    public static void main(String[] args){
        //声明所有的处理节点
        Handler handler1 = new ConcretHandler1();
        Handler handler2 = new ConcretHandler2();
        Handler handler3 = new ConcretHandler3();

        //设置链中的阶段顺序1->2->3
        handler1.setNext(handler2);
        handler2.setNext(handler3);

        //提交请求，返回结果
        Response response = handler1.handlerMessage(new Request());

    }
}
