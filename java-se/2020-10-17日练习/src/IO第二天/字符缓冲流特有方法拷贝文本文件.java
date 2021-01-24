package IO第二天;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class 字符缓冲流特有方法拷贝文本文件 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(""));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(""));
        String leng;
        while((leng=br.readLine())!=null){
            bufferedWriter.write(leng);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        br.close();
        bufferedWriter.close();
    }
}
