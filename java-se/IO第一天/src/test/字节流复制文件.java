package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class 字节流复制文件 {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("D:\\黑马\\就业班\\javaSE高级DIY.xlsx");
        FileOutputStream fos = new FileOutputStream("D:\\黑马\\就业班\\javaSE高级DIY2.xlsx");
        byte[] data=new byte[1024*40];
        int len;
       while((len=fis.read(data))!=-1){
           fos.write(data,0,len);
       }
        fis.close();
        fos.close();
    }
}
