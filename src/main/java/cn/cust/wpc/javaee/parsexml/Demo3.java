package cn.cust.wpc.javaee.parsexml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

/**
 * Dom4j 学习实例3
 * 快速遍历整个xml文档
 */
public class Demo3 {
    public void treeWalk(Document document) {
        treeWalk(document.getRootElement());
    }

    public void treeWalk(Element element) {
        for (int i = 0; i < element.nodeCount(); i++) {
            Node node = element.node(i);
            if(node instanceof Element){
                treeWalk((Element)node);
            }else{

            }
        }
    }

    public static void main(String[] args) throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("src/main/resources/myClass.xml");
        new Demo3().treeWalk(document);
    }
}