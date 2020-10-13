package io流练习二;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//1.字符缓冲流特殊方法拷贝文件
public class Test01 {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(""));
        BufferedWriter bw = new BufferedWriter(new FileWriter(""));
        char[]data=new char[1024];
        String leng;
        while((leng=br.readLine())!=null){
            bw.write(leng);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
