package io流练习一;

import java.io.*;

//3.编写工具类,在工具类中编写拷贝方法,传入目标文件路径和源文件路径,无返回值
public class Test03 {
    public static void copy(File src,File des) throws Exception{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(des));
        byte[]data=new byte[1024];
        int len;
        while((len=bis.read())!=-1){
            bos.write(data,0,len);
        }
        bis.close();
        bos.close();
    }
}
