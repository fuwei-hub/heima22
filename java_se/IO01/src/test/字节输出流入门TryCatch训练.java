package test;

import java.io.FileOutputStream;
import java.io.IOException;

public class 字节输出流入门TryCatch训练 {
    public static void main(String[] args)  {
        FileOutputStream fileOutputStream=null;
        try {
             fileOutputStream = new FileOutputStream("day12\\a.txt");
            //放入一个byte数组
             byte[]arr={97,98,99};
            fileOutputStream.write(arr);
            //放入字符穿转byte数组,然后规定从几开始,展示几个数字
            fileOutputStream.write("abcde".getBytes(),1,3);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileOutputStream!=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
