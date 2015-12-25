package cn.cust.wpc.javaee.weixin.domain.imagetext;

import java.util.*;

/**
 * Created by wpc on 15/12/18.
 */
public class Item {
    private int seq;
    private int app_id;
    private int ile_id;
    private String title;
    private String digest;
    private String create_time;
    private List multi_item;
    private String content_url;
    private String img_url;
    private String author;
    private int show_cover_pic;
    private String update_time;

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getApp_id() {
        return app_id;
    }

    public void setApp_id(int app_id) {
        this.app_id = app_id;
    }

    public int getIle_id() {
        return ile_id;
    }

    public void setIle_id(int ile_id) {
        this.ile_id = ile_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public List getMulti_item() {
        return multi_item;
    }

    public void setMulti_item(List multi_item) {
        this.multi_item = multi_item;
    }

    public String getContent_url() {
        return content_url;
    }

    public void setContent_url(String content_url) {
        this.content_url = content_url;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getShow_cover_pic() {
        return show_cover_pic;
    }

    public void setShow_cover_pic(int show_cover_pic) {
        this.show_cover_pic = show_cover_pic;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "Item{" +
                "seq=" + seq +
                ", app_id=" + app_id +
                ", ile_id=" + ile_id +
                ", title='" + title + '\'' +
                ", digest='" + digest + '\'' +
                ", create_time='" + create_time + '\'' +
                ", multi_item=" + multi_item +
                ", content_url='" + content_url + '\'' +
                ", img_url='" + img_url + '\'' +
                ", author='" + author + '\'' +
                ", show_cover_pic=" + show_cover_pic +
                ", update_time='" + update_time + '\'' +
                '}';
    }
}