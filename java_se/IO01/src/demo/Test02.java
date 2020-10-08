package demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//使用缓冲流+字节数组拷贝文件
public class Test02 {
    public static void main(String[] args)  throws  Exception{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\MECHREVO\\Desktop\\lianxi.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\MECHREVO\\Desktop\\lianxi2.txt"));
        byte[]data=new byte[1024];
        int len;
        while((len=bis.read(data))!=-1){
            bos.write(data,0,len);
        }
        bos.close();
        bis.close();
    }
}
