package cn.cust.wpc.javaee.parsexml;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Dom4j 学习实例3
 * 将 XML 文档写入文件
 */
public class Demo5 {
    public Document createDocument() {
        Document document = DocumentHelper.createDocument();
        Element root = document.addElement("root");

        Element author1 = root.addElement("author")
                .addAttribute("name", "James")
                .addAttribute("location", "UK")
                .addText("James Strachan");

        Element author2 = root.addElement("author")
                .addAttribute("name", "Bob")
                .addAttribute("location", "US")
                .addText("Bob McWhirter");

        return document;
    }

    public void write(Document document) throws IOException {
        XMLWriter writer = new XMLWriter(new FileWriter("src/main/resources/out.xml"));
        writer.write(document);
        writer.close();

        //格式化
        OutputFormat format = OutputFormat.createPrettyPrint();
        writer = new XMLWriter(System.out, format);
        writer.write(document);

        format = OutputFormat.createCompactFormat();
        writer = new XMLWriter(System.out, format);
        writer.write(document);
    }

    public static void main(String[] args) throws IOException {
        Demo5 demo5 = new Demo5();
        demo5.write(demo5.createDocument());
    }

}