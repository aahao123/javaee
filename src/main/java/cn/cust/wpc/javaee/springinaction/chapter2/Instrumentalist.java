package cn.cust.wpc.javaee.springinaction.chapter2;

/**
 * @author: pengcheng.wang
 * @since: 16/1/7 下午10:12
 */
public class Instrumentalist implements Performer {
    public Instrumentalist() {
    }

    @Override
    public void perform() {
        System.out.print("playing " + song);
        instrument.play();
    }

    private String song;
    private Instrument instrument;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}