package cn.cust.wpc.javaee.weixin.domain;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: ImageText
 * @Description:
 * @author: 王大鸟
 * @date: 2016/5/25
 */
public class ImageText {
    private int seq;
    private long app_id;
    private long file_id;
    /**
     * 标题
     */
    private String title;
    /**
     * 摘要
     */
    private String digest;
    /**
     * 创建时间
     */
    private String create_time;
    private List<Map<String,Object>> multi_item;
    /**
     * 正文链接
     */
    private String content_url;
    /**
     * 图片链接
     */
    private String img_url;
    /**
     * 作者
     */
    private String author;
    private int show_cover_pic;
    /**
     * 更新时间
     */
    private String update_time;

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public long getApp_id() {
        return app_id;
    }

    public void setApp_id(long app_id) {
        this.app_id = app_id;
    }

    public long getFile_id() {
        return file_id;
    }

    public void setFile_id(long file_id) {
        this.file_id = file_id;
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

    public List<Map<String, Object>> getMulti_item() {
        return multi_item;
    }

    public void setMulti_item(List<Map<String, Object>> multi_item) {
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
        return "ImageText{" +
                "seq=" + seq +
                ", app_id=" + app_id +
                ", file_id=" + file_id +
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
