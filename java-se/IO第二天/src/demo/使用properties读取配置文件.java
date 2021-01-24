package demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Set;

public class 使用properties读取配置文件 {
    public static void main(String[] args) throws Exception {
        method常规();
        Properties();
    }

    private static void Properties() throws IOException {
        Properties pt = new Properties();
        pt.load(使用properties读取配置文件.class.getClassLoader().getResourceAsStream("Person.properties"));
        System.out.println(pt.getProperty("xuehao"));
        System.out.println(pt.getProperty("name"));
        System.out.println(pt.getProperty("age"));
    }

    private static void method常规() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("IO02\\resources\\Person.properties"));
        Properties pt = new Properties();
        pt.load(br);
        br.close();
        Set<Object> objects = pt.keySet();
        for (Object object : objects) {
            Object o = pt.get(object);
            System.out.println(object+"  "+o);
        }
    }
}
