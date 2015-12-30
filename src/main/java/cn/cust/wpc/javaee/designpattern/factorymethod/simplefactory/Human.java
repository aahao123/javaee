package cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory;

/**
 * 人类总称
 *
 * @author: wpc
 * @since: 15/12/30 下午6:16
 */
public interface Human {
    //每个人中的颜色都不相同
    public void getColor();

    //人类会说话
    public void talk();
}