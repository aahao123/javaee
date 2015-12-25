package cn.cust.wpc.javaee.utils.wx;

import cn.cust.wpc.javaee.utils.HttpUtil;
import cn.cust.wpc.javaee.weixin.domain.Menu.Menu;
import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * 自定义菜单工具类
 */
public class MenuUtil {

    /**
     * 创建微信公众平台自定义菜单
     *
     * @param menu
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String createMenu(Menu menu) throws IOException, URISyntaxException {
        String url = " https://api.weixin.qq.com/cgi-bin/menu/create?access_token=" + AccessTokenFactory.getInstance().accessToken();
        JSONObject jsonObject = JSONObject.fromObject(menu);
        System.out.println(jsonObject.toString());
        HttpEntity entity = HttpUtil.postJson(null, url, jsonObject);
        return HttpUtil.entityToString(entity);
    }

    /**
     * 获取自定义菜单信息
     *
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String getMenu() throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/cgi-bin/menu/get?access_token=" + AccessTokenFactory.getInstance().accessToken();
        HttpEntity entity = HttpUtil.get(null, url);
        return HttpUtil.entityToString(entity);
    }

    /**
     * 删除自定义菜单
     *
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static String deleteMenu() throws IOException, URISyntaxException {
        String url = "https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=" + AccessTokenFactory.getInstance().accessToken();
        HttpEntity entity = HttpUtil.get(null, url);
        return HttpUtil.entityToString(entity);
    }

//    public static void main(String[] args) throws IOException, URISyntaxException {

//        ClickButton button1 = new ClickButton("今日歌曲","12121");
//        ViewButton button2 = new ViewButton("搜索","http://www.baidu.com");
//        ViewButton button3 = new ViewButton("视频","http://v.qq.com");
//        ClickButton button4 = new ClickButton("赞一下我们","12131");
//
//        List<Button> buttons = new ArrayList<>();
//
//        SubMenu subMenu = new SubMenu("菜单");
//        List<Button> subbuttons = new ArrayList<>();
//        subbuttons.add(button2);
//        subbuttons.add(button3);
//        subbuttons.add(button4);
//        subMenu.setSub_button(subbuttons);
//
//        Menu menu = new Menu();
//        buttons.add(button1);
//        buttons.add(subMenu);
//        menu.setButton(buttons);
//
//        System.out.println(MenuUtil.createMenu(menu));


//        System.out.println(MenuUtil.getMenu());

//        System.out.println(MenuUtil.deleteMenu());


//    }
}