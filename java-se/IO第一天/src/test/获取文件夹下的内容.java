package test;

import java.io.File;

public class 获取文件夹下的内容 {
    public static void main(String[] args) {
        File file = new File("C:/");
        //判断是否存在,和判断是否是文件夹
        if(file.exists()&&file.isDirectory()){
            //调用方法获得文件的数组
            File[] files = file.listFiles();
            if(files!=null){
                for (File file1 : files) {
                    System.out.println(file1.getName());
                }
            }
        }
    }
}
