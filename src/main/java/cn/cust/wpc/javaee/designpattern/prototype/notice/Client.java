package cn.cust.wpc.javaee.designpattern.prototype.notice;

/**
 * @author: pengcheng.wang
 * @since: 16/2/14 下午11:42
 */
public class Client {
    public static void main(String[] args){
        Thing thing = new Thing();
        thing.setValue("张三");
        Thing cloneThing = thing.clone();
        cloneThing.setValue("李四");
        System.out.println(thing.getValue().toString());
    }
}