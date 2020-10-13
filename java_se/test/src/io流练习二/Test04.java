package io流练习二;

import java.util.ResourceBundle;

//4.使用ResourceBoundle读取配置文件
public class Test04 {
    public static void main(String[] args) {
        ResourceBundle read = ResourceBundle.getBundle("read");
        System.out.println(read.getString("name"));
        System.out.println(read.getString("age"));

    }
}
