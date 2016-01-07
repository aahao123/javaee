package cn.cust.wpc.javaee.springinaction.chapter2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 表演大厅
 * 初始化需要开灯
 * 销毁需要关灯
 *
 * @author: pengcheng.wang
 * @since: 16/1/6 下午11:26
 */
public class AuditoriumWithSpring implements InitializingBean,DisposableBean {
//    public void turnOnLights() {
//
//    }
//
//    public void trunOffLights() {
//
//    }

    @Override
    public void destroy() throws Exception {
        //  Bean销毁操作
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //  Bean初始化操作
    }
}