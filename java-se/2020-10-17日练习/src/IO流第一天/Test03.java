package IO流第一天;

import java.io.*;

////编写工具类,在工具类中编写拷贝方法,传入目标文件路径和源文件路径,无返回值
public class Test03 {

    public static void copy(File src, File des) throws Exception {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(des));
        byte[]data=new byte[1024];
        int len;
        while((len=bis.read())!=-1){
            bos.write(data,0,len);
            bos.flush();
        }
        bis.close();
        bos.close();
    }
}
//编写方法,拷贝文件夹
class CopyDirectory{
    public static void main(String[] args) throws Exception {
        File file = new File("");
        File file1 = new File("");
        copyDir(file,file1);
    }

    private static void copyDir(File src, File des) throws Exception {
        File file = new File(des, src.getName());
        file.mkdirs();
        File[] files = file.listFiles();
        if(files!=null){
            for (File file1 : files) {
                if(file1.isFile()){
                    Test03.copy(file1,new File(file,file1.getName()));
                }else{
                    copyDir(file1,file);
                }
            }
        }
    }
}
