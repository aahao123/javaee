package cn.cust.wpc.javaee.bcsx.enumdemo;

/**
 * Created by 王大鸟 on 2016/4/27.
 */
public enum Demo4 {
    SCOUT, CARGO, TRANSPORT, CRUISER, BATTLESHIP, MOTHERSHIP;

    @Override
    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0) + lower;
    }

    public static void main(String[] args) {
        for (Demo4 demo4 : Demo4.values()) {
            System.out.println(demo4);
        }
    }
}
