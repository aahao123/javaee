package cn.cust.wpc.javaee.designpattern.chainOfResponsibility.common;

/**
 * Created by 王大鸟 on 2016/3/30.
 */
public abstract class Handler {
    private Handler nextHandler;

    //设置下一个处理者是谁
    public void setNext(Handler _handler){
        this.nextHandler = _handler;
    }

    //每个处理者都有一个处理请求
    protected abstract Level getHandlerLevel();

    //每个处理者都必须实现处理任务
    protected abstract Response echo(Request requet);

    //每个处理者都必须对请求做出处理
    public final Response handlerMessage(Request request){
        Response response = null;
        //判断是否是自己的处理级别
        if(this.getHandlerLevel().equals(request.getRequestLevel())){
            response = this.echo(request);
        }else{//不属于自己的级别
            //判断是否有下一个处理者
            if(this.nextHandler != null){
                response = this.nextHandler.handlerMessage(request);
            }else{
                //没有适当的处理者，业务自行处理
            }
        }
        return response;
    }
}
