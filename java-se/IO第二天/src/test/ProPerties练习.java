package test;

import java.util.Properties;
import java.util.Set;

public class ProPerties练习 {
    public static void main(String[] args) {
        //properties的添加方法  setproperty
        Properties properties = new Properties();
        properties.setProperty("zhangsan","23");
        properties.setProperty("lisi","223");
        properties.setProperty("wangwu","25");
        properties.setProperty("zhangsan","23");
        //properties的遍历   stringPropertyNames返回一个String类型的键的单列集合
        Set<String> strings = properties.stringPropertyNames();
        for (String string : strings) {
            String property = properties.getProperty(string);
            System.out.println(string+"  "+property);
        }
    }
}
