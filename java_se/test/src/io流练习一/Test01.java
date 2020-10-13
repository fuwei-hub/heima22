package io流练习一;
//递归删除文件夹

import java.io.File;

public class Test01 {
    public static void main(String[] args) {
        File file = new File("");
        delete(file);

    }

    private static void delete(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {
                if (file1.isDirectory()) {
                    delete(file1);
                } else {
                    file1.delete();
                }
            }
        }
    }
}

