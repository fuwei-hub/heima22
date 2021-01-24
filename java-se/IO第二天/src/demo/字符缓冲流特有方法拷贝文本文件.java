package demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class 字符缓冲流特有方法拷贝文本文件 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("IO02\\src\\demo\\aa.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("IO02\\src\\demo\\aa.txt.bak"));
        String leng;
        while ((leng = br.readLine()) != null) {
            bw.write(leng);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        bw.close();
    }
}
