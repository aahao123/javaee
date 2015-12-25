package cn.cust.wpc.javaee.weixin.domain.businessshop;

import cn.cust.wpc.javaee.weixin.domain.photo.Photo;

import java.util.*;

/**
 * 创建门店的 base_info 封装实体类
 */
public class BaseInfo {
    /**
     *
     */
    private String sid;
    /**
     * 门店名称
     */
    private String business_name;
    /**
     * 分店名称
     */
    private String branch_name;
    /**
     * 门店所在省份
     */
    private String province;
    /**
     * 门店所在城市
     */
    private String city;
    /**
     * 门店所在地区
     */
    private String district;
    /**
     * 门店所在的详细街道地址
     */
    private String address;
    /**
     * 门店的电话
     */
    private String telephone;
    /**
     * 门店的类型
     */
    private String[] categories;
    /**
     * 坐标类型（目前只能选1）
     */
    private long offset_type;
    /**
     * 门店所在地理位置的经度
     */
    private double longitude;
    /**
     * 门店所在地理位置的纬度
     */
    private double latitude;
    /**
     * 图片列表，url 形式，可以有多张图片
     */
    private List<Photo> photo_list;
    /**
     * 推荐品
     */
    private String recommend;
    /**
     * 特色服务
     */
    private String special;
    /**
     * 商户简介
     */
    private String introduction;
    /**
     * 营业时间
     */
    private String open_time;
    /**
     * 人均价格
     */
    private double avg_price;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getBusiness_name() {
        return business_name;
    }

    public void setBusiness_name(String business_name) {
        this.business_name = business_name;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public long getOffset_type() {
        return offset_type;
    }

    public void setOffset_type(long offset_type) {
        this.offset_type = offset_type;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public List<Photo> getPhoto_list() {
        return photo_list;
    }

    public void setPhoto_list(List<Photo> photo_list) {
        this.photo_list = photo_list;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getOpen_time() {
        return open_time;
    }

    public void setOpen_time(String open_time) {
        this.open_time = open_time;
    }

    public double getAvg_price() {
        return avg_price;
    }

    public void setAvg_price(double avg_price) {
        this.avg_price = avg_price;
    }
}