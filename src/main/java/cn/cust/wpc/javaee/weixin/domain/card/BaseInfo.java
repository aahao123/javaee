package cn.cust.wpc.javaee.weixin.domain.card;

/**
 * Created by wpc on 15/12/25.
 */
public class BaseInfo {
    private String logo_url;
    private String brand_name;
    private String code_type;
    private String title;
    private String color;
    private String notice;
    private String service_phone;
    private String description;
    private DateInfo date_info;
    private Sku sku;
    private String get_limit;
    private String use_custom_code;
    private String can_give_friend;
    private long[] location_id_list;
    private String custom_url_name;
    private String custom_url;
    private String custom_url_sub_title;
    private String promotion_url_name;
    private String promotion_url;
    private boolean need_push_on_view;

    public String getLogo_url() {
        return logo_url;
    }

    public void setLogo_url(String logo_url) {
        this.logo_url = logo_url;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getCode_type() {
        return code_type;
    }

    public void setCode_type(String code_type) {
        this.code_type = code_type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getService_phone() {
        return service_phone;
    }

    public void setService_phone(String service_phone) {
        this.service_phone = service_phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DateInfo getDate_info() {
        return date_info;
    }

    public void setDate_info(DateInfo date_info) {
        this.date_info = date_info;
    }

    public Sku getSku() {
        return sku;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }

    public String getGet_limit() {
        return get_limit;
    }

    public void setGet_limit(String get_limit) {
        this.get_limit = get_limit;
    }

    public String getUse_custom_code() {
        return use_custom_code;
    }

    public void setUse_custom_code(String use_custom_code) {
        this.use_custom_code = use_custom_code;
    }

    public String getCan_give_friend() {
        return can_give_friend;
    }

    public void setCan_give_friend(String can_give_friend) {
        this.can_give_friend = can_give_friend;
    }

    public long[] getLocation_id_list() {
        return location_id_list;
    }

    public void setLocation_id_list(long[] location_id_list) {
        this.location_id_list = location_id_list;
    }

    public String getCustom_url_name() {
        return custom_url_name;
    }

    public void setCustom_url_name(String custom_url_name) {
        this.custom_url_name = custom_url_name;
    }

    public String getCustom_url() {
        return custom_url;
    }

    public void setCustom_url(String custom_url) {
        this.custom_url = custom_url;
    }

    public String getCustom_url_sub_title() {
        return custom_url_sub_title;
    }

    public void setCustom_url_sub_title(String custom_url_sub_title) {
        this.custom_url_sub_title = custom_url_sub_title;
    }

    public String getPromotion_url_name() {
        return promotion_url_name;
    }

    public void setPromotion_url_name(String promotion_url_name) {
        this.promotion_url_name = promotion_url_name;
    }

    public String getPromotion_url() {
        return promotion_url;
    }

    public void setPromotion_url(String promotion_url) {
        this.promotion_url = promotion_url;
    }

    public boolean isNeed_push_on_view() {
        return need_push_on_view;
    }

    public void setNeed_push_on_view(boolean need_push_on_view) {
        this.need_push_on_view = need_push_on_view;
    }
}