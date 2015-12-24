package cn.cust.wpc.javaee.weixin.domain.ImageText;

import java.util.List;

/**
 * Created by wpc on 15/12/18.
 */
public class AppMsgInfo {
    private List<Item> item;
    private FileCnt file_cnt;
    private int is_upload_cdn_ok;
    private int search_cnt;

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public FileCnt getFile_cnt() {
        return file_cnt;
    }

    public void setFile_cnt(FileCnt file_cnt) {
        this.file_cnt = file_cnt;
    }

    public int getIs_upload_cdn_ok() {
        return is_upload_cdn_ok;
    }

    public void setIs_upload_cdn_ok(int is_upload_cdn_ok) {
        this.is_upload_cdn_ok = is_upload_cdn_ok;
    }

    public int getSearch_cnt() {
        return search_cnt;
    }

    public void setSearch_cnt(int search_cnt) {
        this.search_cnt = search_cnt;
    }

    public List<Item> getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "AppMsgInfo{" +
                "item=" + item +
                ", file_cnt=" + file_cnt +
                ", is_upload_cdn_ok=" + is_upload_cdn_ok +
                ", search_cnt=" + search_cnt +
                '}';
    }
}