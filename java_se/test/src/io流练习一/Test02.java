package io流练习一;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//2.使用缓冲流字节数组拷贝文件


public class Test02 {
    public static void main(String[] args) throws Exception{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(""));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(""));
        byte[]data=new byte[1024];
        int len;
        while((len=bis.read())!=-1){
            bos.write(data,0,len);
        }
        bis.close();
        bos.close();
    }
}
