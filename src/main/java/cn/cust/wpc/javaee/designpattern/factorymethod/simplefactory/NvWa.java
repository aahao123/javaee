package cn.cust.wpc.javaee.designpattern.factorymethod.simplefactory;

/**
 * 女娲
 * @author: wpc
 * @since: 15/12/30 下午6:35
 */
public class NvWa {
    public static void main(String[] args){
        //声明阴阳八卦炉
        AbstractHumanFactory abstractHumanFactory = new HumanFactory();

        Human whiteHuman = abstractHumanFactory.createHuman(WhiteMan.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        Human blackHuman = abstractHumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        Human yellowHuman = abstractHumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}