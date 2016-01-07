package cn.cust.wpc.javaee.springinaction.chapter2;

import java.util.Properties;

/**
 * @author: pengcheng.wang
 * @since: 16/1/7 下午10:55
 */
public class OneManBandProperties implements Performer {

    public OneManBandProperties() {
    }

    @Override
    public void perform() {

    }

    private Properties instruments;

    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }
}