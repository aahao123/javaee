package cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory;

/**
 * 人类创建工厂
 * @author: wpc
 * @since: 15/12/30 下午6:32
 */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        //定义一个生产的人种
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e){
            System.out.println("人种生成错误！");
        }
        return (T) human;
    }
}