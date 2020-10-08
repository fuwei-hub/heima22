package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class 使用缓冲流的特有方法拷贝文件 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("IO02\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("IO02\\a.txt.bak"));
        String leng;
        while((leng=br.readLine())!=null){
            bw.write(leng);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
