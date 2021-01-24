package test;

import java.io.FileOutputStream;
import java.io.IOException;

public class 字节输出流入门 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("day12\\a.txt");
        fileOutputStream.write('b');
        fileOutputStream.close();
    }
}
