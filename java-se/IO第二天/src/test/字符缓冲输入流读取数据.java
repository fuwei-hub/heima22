package test;

import java.io.BufferedReader;
import java.io.FileReader;

public class 字符缓冲输入流读取数据 {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new FileReader("IO02\\a.txt"));
        char[]data=new char[1024];
        int len;
        while((len=bufferedReader.read(data))!=-1){
            System.out.println(new String(data,0,len));
        }
        bufferedReader.close();
    }
}
