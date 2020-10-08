package test;

import java.io.FileInputStream;

public class 字节输入流练习 {
    public static void main(String[] args) throws Exception {
        //创建对象
        FileInputStream fileInputStream = new FileInputStream("day12\\a.txt");
        //读取数据
        int date;
        while ((date = fileInputStream.read()) != -1) {
            System.out.println((char) date);
        }
        //释放资源
        fileInputStream.close();
    }
}
