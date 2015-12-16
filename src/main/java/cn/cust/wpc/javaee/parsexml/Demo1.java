package cn.cust.wpc.javaee.parsexml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.net.URL;

/**
 * Dom4j 学习实例1
 * 将 XML 文档转换成一个 Document 对象
 */
public class Demo1 {

    public Document parse(URL uri) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read(uri);
        return document;
    }
}