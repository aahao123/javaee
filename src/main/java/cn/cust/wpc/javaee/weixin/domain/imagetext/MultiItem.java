package cn.cust.wpc.javaee.weixin.domain.imagetext;

import java.util.*;

/**
 * Created by wpc on 15/12/18.
 */
public class MultiItem {
    private int seq;
    private String cover;
    private String title;
    private String digest;
    private String content_url;
    private int file_id;
    private String source_url;
    private String author;
    private int show_cover_pic;
    private int copyright_type;
    private int can_reward;
    private String reward_wording;
    private int is_new_video;
    private List tags;
    private int need_open_comment;
    private String free_content;

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
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

    public String getContent_url() {
        return content_url;
    }

    public void setContent_url(String content_url) {
        this.content_url = content_url;
    }

    public int getFile_id() {
        return file_id;
    }

    public void setFile_id(int file_id) {
        this.file_id = file_id;
    }

    public String getSource_url() {
        return source_url;
    }

    public void setSource_url(String source_url) {
        this.source_url = source_url;
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

    public int getCopyright_type() {
        return copyright_type;
    }

    public void setCopyright_type(int copyright_type) {
        this.copyright_type = copyright_type;
    }

    public int getCan_reward() {
        return can_reward;
    }

    public void setCan_reward(int can_reward) {
        this.can_reward = can_reward;
    }

    public String getReward_wording() {
        return reward_wording;
    }

    public void setReward_wording(String reward_wording) {
        this.reward_wording = reward_wording;
    }

    public int getIs_new_video() {
        return is_new_video;
    }

    public void setIs_new_video(int is_new_video) {
        this.is_new_video = is_new_video;
    }

    public List getTags() {
        return tags;
    }

    public void setTags(List tags) {
        this.tags = tags;
    }

    public int getNeed_open_comment() {
        return need_open_comment;
    }

    public void setNeed_open_comment(int need_open_comment) {
        this.need_open_comment = need_open_comment;
    }

    public String getFree_content() {
        return free_content;
    }

    public void setFree_content(String free_content) {
        this.free_content = free_content;
    }

    @Override
    public String toString() {
        return "MultiItem{" +
                "seq=" + seq +
                ", cover='" + cover + '\'' +
                ", title='" + title + '\'' +
                ", digest='" + digest + '\'' +
                ", content_url='" + content_url + '\'' +
                ", file_id=" + file_id +
                ", source_url='" + source_url + '\'' +
                ", author='" + author + '\'' +
                ", show_cover_pic=" + show_cover_pic +
                ", copyright_type=" + copyright_type +
                ", can_reward=" + can_reward +
                ", reward_wording='" + reward_wording + '\'' +
                ", is_new_video=" + is_new_video +
                ", tags=" + tags +
                ", need_open_comment=" + need_open_comment +
                ", free_content='" + free_content + '\'' +
                '}';
    }
}