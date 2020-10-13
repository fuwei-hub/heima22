package io流练习二;

import java.util.Properties;

//3.使用properties读取配置文件
public class Test03 {
    public static void main(String[] args)throws Exception {
        Properties properties = new Properties();
        properties.load(Test03.class.getClassLoader().getResourceAsStream("read.properties"));
        System.out.println(properties.getProperty("name"));
        System.out.println(properties.getProperty("age"));
    }
}
