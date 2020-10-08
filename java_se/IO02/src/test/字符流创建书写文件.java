package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class 字符流创建书写文件 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("IO02\\a.txt",true));
        bw.write("我爱JAVA,JAVA爱我");

        bw.close();
        String s = new String();

    }
}
