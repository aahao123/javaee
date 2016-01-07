package cn.cust.wpc.javaee.springinaction.chapter2;

import java.util.Map;

/**
 * @author: pengcheng.wang
 * @since: 16/1/7 下午10:49
 */
public class OneManBandMap implements Performer {
    public OneManBandMap() {
    }

    @Override
    public void perform() {

    }

    private Map<String, Instrument> instrumentMap;

    public void setInstrumentMap(Map<String, Instrument> instrumentMap) {
        this.instrumentMap = instrumentMap;
    }
}