package cn.cust.wpc.javaee.weixin.domain.imagetext;

/**
 * Created by wpc on 15/12/18.
 */
public class FileCnt {
    private int total;
    private int img_cnt;
    private int voice_cnt;
    private int video_cnt;
    private int app_msg_cnt;
    private int commondity_msg_cnt;
    private int video_msg_cnt;
    private int short_video_cnt;
    private int app_msg_sent_cnt;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getImg_cnt() {
        return img_cnt;
    }

    public void setImg_cnt(int img_cnt) {
        this.img_cnt = img_cnt;
    }

    public int getVoice_cnt() {
        return voice_cnt;
    }

    public void setVoice_cnt(int voice_cnt) {
        this.voice_cnt = voice_cnt;
    }

    public int getVideo_cnt() {
        return video_cnt;
    }

    public void setVideo_cnt(int video_cnt) {
        this.video_cnt = video_cnt;
    }

    public int getApp_msg_cnt() {
        return app_msg_cnt;
    }

    public void setApp_msg_cnt(int app_msg_cnt) {
        this.app_msg_cnt = app_msg_cnt;
    }

    public int getCommondity_msg_cnt() {
        return commondity_msg_cnt;
    }

    public void setCommondity_msg_cnt(int commondity_msg_cnt) {
        this.commondity_msg_cnt = commondity_msg_cnt;
    }

    public int getVideo_msg_cnt() {
        return video_msg_cnt;
    }

    public void setVideo_msg_cnt(int video_msg_cnt) {
        this.video_msg_cnt = video_msg_cnt;
    }

    public int getShort_video_cnt() {
        return short_video_cnt;
    }

    public void setShort_video_cnt(int short_video_cnt) {
        this.short_video_cnt = short_video_cnt;
    }

    public int getApp_msg_sent_cnt() {
        return app_msg_sent_cnt;
    }

    public void setApp_msg_sent_cnt(int app_msg_sent_cnt) {
        this.app_msg_sent_cnt = app_msg_sent_cnt;
    }

    @Override
    public String toString() {
        return "FileCnt{" +
                "total=" + total +
                ", img_cnt=" + img_cnt +
                ", voice_cnt=" + voice_cnt +
                ", video_cnt=" + video_cnt +
                ", app_msg_cnt=" + app_msg_cnt +
                ", commondity_msg_cnt=" + commondity_msg_cnt +
                ", video_msg_cnt=" + video_msg_cnt +
                ", short_video_cnt=" + short_video_cnt +
                ", app_msg_sent_cnt=" + app_msg_sent_cnt +
                '}';
    }
}