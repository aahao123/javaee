package cn.cust.wpc.javaee.designpattern.chainOfResponsibility;

/**
 * Created by 王大鸟 on 2016/3/29.
 */
public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST=1;
    public final static int HUSBAND_LEVEL_REQUEST=2;
    public final static int SON_LEVEL_REQUEST=3;

    //能处理的级别
    private int level = 0;
    //责任传递，下一个责任人是谁
    private Handler nextHandler;

    //每个类都要说明一下自己能处理哪些请求
    public Handler(int _level){
        this.level = _level;
    }

    public final void handleMessage(IWoman woman){
        if(woman.getType() == this.level){
            this.response(woman);
        }else{
            if(this.nextHandler!=null){//有后续环节，才把请求往后递送
                this.nextHandler.handleMessage(woman);
            }else{//已经没有后续处理人了，不用处理了
                System.out.println("---没地方请示了，按不同意处理---");
            }
        }
    }

    /**
     * 如果不属于你处理的请求，你应该让她找下一个环节的人，如女儿出嫁了，
     * 还向父亲请示是否可以逛街，那父亲就应该告诉女儿，应该找丈夫请示
     * @param handler
     */
    public void setNext(Handler handler){
        this.nextHandler = handler;
    }

    //有请求当然要回应
    public abstract void response(IWoman woman);
}
