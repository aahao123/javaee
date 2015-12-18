package cn.cust.wpc.javaee.jsonlib;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.*;

/**
 * Created by wpc on 15/12/18.
 */
public class JsonTest {

    /**
     * 将数组转换成json
     */
    public void testArrayToJson() {
        boolean[] boolArray = new boolean[]{true, false, true};
        JSONArray jsonArray = JSONArray.fromObject(boolArray);

        System.out.println();
        System.out.println(jsonArray);
    }

    /**
     * List转为json
     */
    public void testListToJson() {
        List list = new ArrayList();
        list.add("first");
        list.add("second");
        JSONArray jsonArray = JSONArray.fromObject(list);
        System.out.println();
        System.out.println(jsonArray);
    }

    /**
     * 把json字符串转换成json
     */
    public void testJsonStrToJson() {
        JSONArray jsonArray = JSONArray.fromObject("['json','is','easy']");
        System.out.println();
        System.out.println(jsonArray);
    }

    /**
     * Map转换成Json 使用JSONObject
     */
    public void testMapToJson() {
        Map map = new HashMap();
        map.put("name", "json");
        map.put("bool", Boolean.TRUE);
        map.put("int", new Integer(1));
        map.put("arr", new String[]{"a", "b"});
        map.put("fuc", "function(i){return this.arr[i]}");

        JSONObject jsonObject = JSONObject.fromObject(map);
        System.out.println();
        System.out.println(jsonObject);
    }

    /**
     * 复合类型bean转换成json
     */
    public void testBeanToJson() {
        MyBean myBean = new MyBean();
        myBean.setId("001");
        myBean.setName("银行卡");
        myBean.setDate(new Date());

        List cardNum = new ArrayList();
        cardNum.add("农行");
        cardNum.add("工行");
        cardNum.add("建行");
        cardNum.add(new Person("test"));

        myBean.setCardNum(cardNum);

        JSONObject jsonObject = JSONObject.fromObject(myBean);
        System.out.println();
        System.out.println(jsonObject);
    }

    public void testJsonToObject(){
        String json = "{name=\"json\",bool:true,int:1,double:2.2,func:function(a){ return a; },array:[1,2]}";
        JSONObject jsonObject = JSONObject.fromObject(json);
        System.out.println();
        System.out.println(jsonObject);
        Object bean = JSONObject.toBean(jsonObject);
    }


    public static void main(String[] args) {
        JsonTest demo1 = new JsonTest();
        demo1.testArrayToJson();
        demo1.testListToJson();
        demo1.testJsonStrToJson();
        demo1.testMapToJson();
        demo1.testBeanToJson();
    }

}