package cn.cust.wpc.javaee.bcsx.enumdemo;

/**
 * @ClassName: Demo3
 * @Description:
 * @author: 王大鸟
 * @date: 2016/4/27
 */
public enum Demo3 {

    WEST("西方。。。。"),
    NORTH("北方。。。。"),
    EAST("东方。。。"),
    SOUTH("南方。。。");

    //方法属性必须在定义enum实例之后，否则编译出错
    private String description;

    private Demo3(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        for (Demo3 demo3 : Demo3.values()) {
            System.out.println(demo3 + " : " + demo3.getDescription());
        }
    }


}
