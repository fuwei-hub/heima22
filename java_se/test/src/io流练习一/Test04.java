package io流练习一;

import java.io.File;

//4.编写方法,拷贝文件夹
public class Test04 {
    public static void main(String[] args) throws Exception {
        File file = new File("");
        File file1 = new File("");
        copyDir(file,file1);
    }

    private static void copyDir(File file, File file1) throws Exception{
        File file2 = new File(file1, file.getName());
        File[] files = file.listFiles();
        for (File file3 : files) {
            if(file3.isFile()){
                Test03.copy(file3,new File(file2,file3.getName()));
            }
            copyDir(file3,file2);
        }
    }
}
