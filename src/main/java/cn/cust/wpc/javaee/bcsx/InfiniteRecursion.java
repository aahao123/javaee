package cn.cust.wpc.javaee.bcsx;

/**
 * @author: pengcheng.wang
 * @since: 16/1/4 下午3:01
 */
public class InfiniteRecursion {
    @Override
    public String toString() {
        return "InfiniteRecursion{}"+super.toString();
    }

    public static void main(String[] args){
        int x = 10;
        double y = 3.2312;
        System.out.println("Row 1:["+x+" "+y+"]");
        System.out.printf("Row 1:[%d %f]\n",x,y);
        System.out.format("Row 1:[%d %f]\n",x,y);
    }
}