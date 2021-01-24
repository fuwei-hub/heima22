package test;

import java.io.File;

public class 删除文件夹下的文件 {
    public static void main(String[] args) {
        File file = new File("C:/Users/MECHREVO/Desktop/新建文件夹");
        delFile(file);
    }

    private static void delFile(File file) {
/*        //判断文件下是否有内容(遍历,然后判断是否为空)
        File[] files = file.listFiles();
        if(files!=null){
            //遍历文件,判断是否为文件
            for (File file1 : files) {
                //如果是文件夹,使用递归再次调用次方法
                if(file1.isDirectory()){
                    delFile(file1);
                    //如果是文件,直接删除
                }else if(file1.isFile()){
                    file1.delete();
                }
            }
        }
        file.delete();*/
        File[] files = file.listFiles();
        if(files.length!=0){
            for (File file1 : files) {
                if(file1.isFile()){
                    file1.delete();
                }else if(file1.isDirectory()){
                    delFile(file1);
                }
            }
        }
        file.delete();
    }
}
