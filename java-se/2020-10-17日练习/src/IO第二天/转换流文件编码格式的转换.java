package IO第二天;

import java.io.*;

public class 转换流文件编码格式的转换 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(""), "GBK"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(""), "UTF-8"));
        String leng;
        while((leng=br.readLine())!=null){
            bw.write(leng);
            bw.flush();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
