package test.test01;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class 解析文件 {
    public static void main(String[] args) throws Exception {
        //获取到文本文档
        Document document = new SAXReader().read(new File("D:\\code\\java-se\\xml-枚举-注解\\src\\test\\test01\\Test01.xml"));
        Element rootElement = document.getRootElement();
        List<Element>student = rootElement.elements("student");
        for (Element element : student) {
            String id = element.attribute("id").getValue();
            String name = element.element("name").getText();
            String age = element.element("age").getText();
            String address = element.element("address").getText();
            System.out.println(id+" "+name+" "+age+" "+address);
        }
    }

}
