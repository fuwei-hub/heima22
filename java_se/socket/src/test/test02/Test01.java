package test.test02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

//客户端     输入小写返回大写
public class Test01 {
    public static void main(String[] args) throws Exception {
        Socket localhost = new Socket("localhost", 10000);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(localhost.getOutputStream()));
        bufferedWriter.write("heLLo");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(localhost.getInputStream()));
        String s = bufferedReader.readLine();
        System.out.println(s);

        localhost.close();

    }
}
