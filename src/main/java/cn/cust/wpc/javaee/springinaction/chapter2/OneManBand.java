package cn.cust.wpc.javaee.springinaction.chapter2;

import java.util.Collection;

/**
 * @author: pengcheng.wang
 * @since: 16/1/7 下午10:43
 */
public class OneManBand implements Performer {
    public OneManBand() {
    }

    @Override
    public void perform() {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

    private Collection<Instrument> instruments;

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
}