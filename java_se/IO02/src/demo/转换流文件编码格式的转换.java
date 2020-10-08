package demo;

import java.io.*;

public class 转换流文件编码格式的转换 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\MECHREVO\\Desktop\\转换.txt"),"UTF-8"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("IO02\\src\\demo\\bb.txt"), "gbk"));
        String leng;
        while((leng=br.readLine())!=null){
            bw.write(leng);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
