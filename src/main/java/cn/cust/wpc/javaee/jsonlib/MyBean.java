package cn.cust.wpc.javaee.jsonlib;

import java.util.Date;
import java.util.List;

/**
 * Created by wpc on 15/12/18.
 */
public class MyBean {
    private String id;
    private String name;
    private Date date;
    private List cardNum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List getCardNum() {
        return cardNum;
    }

    public void setCardNum(List cardNum) {
        this.cardNum = cardNum;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", cardNum=" + cardNum +
                '}';
    }
}