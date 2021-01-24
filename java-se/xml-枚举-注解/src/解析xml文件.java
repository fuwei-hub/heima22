import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class 解析xml文件 {
    public static void main(String[] args) throws Exception {
        //读取文本文档
        Document document = new SAXReader().read(new File("D:\\code\\java-se\\xml-枚举-注解\\resources\\myxml.xml"));
        //获取根标签
        Element rootElement = document.getRootElement();
        //获取student标签
        List<Element> elements = rootElement.elements("student");
        //遍历标签
        for (Element element : elements) {
            String id = element.attribute("id").getValue();
            String text = element.element("name").getText();
            String age = element.element("age").getText();
            System.out.println(id+" "+text+" "+age);
        }
    }
}
