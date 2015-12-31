package cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory;

/**
 * 场景类
 * @author: wpc
 * @since: 15/12/31 上午10:38
 */
public class Client {
    public static void main(String[] args) {
        Crator crator = new ConcreateCreator();
        Product product = crator.createProduct(ConcreteProduct1.class);
        /**
         * 继续业务处理
         */
    }
}