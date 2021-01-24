package demo;

import java.io.File;

//编写方法,递归删除文件夹
public class Test01 {
    public static void main(String[] args) {
        File file = new File("D:\\付伟\\论文");
        delete(file);
    }

    private static void delete(File file) {
        File[] files = file.listFiles();
        if(files!=null){
            for (File file1 : files) {
                if(file1.isFile()){
                   file1.delete();
                }
                delete(file1);
            }
        }
        file.delete();

    }
}
