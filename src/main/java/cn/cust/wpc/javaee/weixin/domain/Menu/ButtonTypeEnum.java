package cn.cust.wpc.javaee.weixin.domain.Menu;

/**
 * 菜单类型枚举
 * Created by wpc on 15/12/25.
 */
public enum ButtonTypeEnum {
    /**
     * 点击推事件
     */
    click,
    /**
     * 跳转URL
     */
    view,
    /**
     * 扫码推事件
     */
    scancode_push,
    /**
     * 扫码推事件且弹出“消息接收中”提示框
     */
    scancode_waitmsg,
    /**
     * 弹出系统拍照发图
     */
    pic_sysphoto,
    /**
     * 弹出拍照或者相册发图
     */
    pic_photo_or_album,
    /**
     * 弹出微信相册发图器
     */
    pic_weixin,
    /**
     * 弹出地理位置选择器
     */
    location_select,
    /**
     * 下发消息（除文本消息）
     */
    media_id,
    /**
     * 跳转图文消息URL
     */
    view_limited
}