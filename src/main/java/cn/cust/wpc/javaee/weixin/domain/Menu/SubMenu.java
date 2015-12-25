package cn.cust.wpc.javaee.weixin.domain.Menu;

import java.util.*;

/**
 * Created by wpc on 15/12/24.
 */
public class SubMenu extends Button {
    private List<Button> sub_button;

    public SubMenu() {
    }

    public SubMenu(String name) {
        super(name);
    }

    public List<Button> getSub_button() {
        return sub_button;
    }

    public void setSub_button(List<Button> sub_button) {
        this.sub_button = sub_button;
    }
}