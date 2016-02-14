package cn.cust.wpc.javaee.designpattern.prototype.notice;

import java.util.ArrayList;

/**
 * @author: pengcheng.wang
 * @since: 16/2/14 下午11:40
 * 浅拷贝与深拷贝
 */
public class Thing implements Cloneable {
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
            //  下面这段代码将会实现深拷贝
//            thing.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue() {
        return this.arrayList;
    }
}