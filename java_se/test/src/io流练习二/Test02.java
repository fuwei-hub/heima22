package io流练习二;

import java.io.*;

//2.转换流文件编码格式的转换
public class Test02 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("")));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("")));
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
