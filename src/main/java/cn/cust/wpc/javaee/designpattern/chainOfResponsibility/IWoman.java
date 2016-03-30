package cn.cust.wpc.javaee.designpattern.chainOfResponsibility;

/**
 * Created by 王大鸟 on 2016/3/29.
 */
public interface IWoman {
    //获得个人状况
    public int getType();

    //获得个人请求，你要干什么？出去逛街？约会？还是看电影？
    public String getRequest();
}
