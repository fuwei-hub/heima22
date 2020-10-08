package demo;


import java.io.*;


//编写工具类,在工具类中编写拷贝方法,传入目标文件路径和源文件路径,无返回值
public class Test03 {

    public static void copyFile(File srcFile, File destFile) throws Exception {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        byte[] data = new byte[1024];
        int len;
        while ((len = bis.read()) != -1) {
            bos.write(data, 0, len);
        }
        bis.close();
        bos.close();
    }
}
