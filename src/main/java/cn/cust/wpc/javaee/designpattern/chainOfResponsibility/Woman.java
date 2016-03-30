package cn.cust.wpc.javaee.designpattern.chainOfResponsibility;

/**
 * Created by 王大鸟 on 2016/3/29.
 */
public class Woman implements IWoman {

    /**
     * 通过一个int类型的参数来描述妇女的个人状况
     * 1--未出嫁
     * 2--出嫁
     * 3--父死
     */
    private int type = 0;
    //妇女的请示
    private String request = "";

    /**
     * 构造函数传递过来请求
     * @param _type
     * @param _request
     */
    public Woman(int _type,String _request){
        this.type = _type;
        //为了便于显示，在这里做了点处理
        switch (this.type){
            case 1:
                this.request = "女儿的请求是:"+_request;
                break;
            case 2:
                this.request = "妻子的请求是:"+_request;
                break;
            case 3:
                this.request = "母亲的请求是:"+_request;
                break;
        }
    }
    //获得自己的状况
    @Override
    public int getType() {
        return this.type;
    }

    //获得妇女的请求
    @Override
    public String getRequest() {
        return this.request;
    }
}
