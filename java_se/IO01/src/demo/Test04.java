package demo;

import java.io.File;

//编写方法,拷贝文件夹
public class Test04 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\MECHREVO\\Desktop\\Task04");
        File file2 = new File("C:\\Users\\MECHREVO\\Desktop\\copy");
        copyDir(file, file2);
    }

    private static void copyDir(File srcDir, File destDir) throws Exception {
        File file = new File(destDir, srcDir.getName());
        file.mkdirs();
        File[] files = srcDir.listFiles();
        for (File file1 : files) {
            if(file1.isFile()){
            Test03.copyFile(file1,new File(file,file1.getName()));
            }
            else{
                copyDir(file1,file);
            }
        }
    }
}
