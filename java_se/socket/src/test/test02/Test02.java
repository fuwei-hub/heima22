package test.test02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

//服务器端
public class Test02 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(10000);
        Socket accept = serverSocket.accept();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String s = bufferedReader.readLine();
        String s1 = s.toUpperCase();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bufferedWriter.write(s1);
        bufferedWriter.newLine();
        bufferedWriter.flush();

        accept.close();
        serverSocket.close();
    }
}
