package cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory;

/**
 * 具体工厂类
 *
 * @author: wpc
 * @since: 15/12/31 上午10:34
 */
public class ConcreateCreator extends Crator {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            //异常处理
        }
        return (T) product;
    }
}