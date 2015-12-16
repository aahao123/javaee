package cn.cust.wpc.javaee.parsexml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;

import java.util.Iterator;

/**
 * Dom4j 学习实例2
 * 遍历
 */
public class Demo2 {

    public void bar(Document doc) {
        Element root = doc.getRootElement();

        //遍历一个元素的子元素
        for (Iterator i = root.elementIterator(); i.hasNext(); ) {
            Element element = (Element) i.next();
        }

        //遍历指定元素的子元素
        for (Iterator i = root.elementIterator("stu"); i.hasNext(); ) {
            Element stu = (Element) i.next();
        }

        //遍历元素的属性
        for (Iterator i = root.attributeIterator(); i.hasNext(); ) {
            Attribute attribute = (Attribute) i.next();
        }
    }

}