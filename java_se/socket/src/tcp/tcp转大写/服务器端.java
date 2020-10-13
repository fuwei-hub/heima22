package tcp.tcp转大写;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class 服务器端 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket accept = serverSocket.accept();
        /*创建输入流,接收数据*/
        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        /*读取数据,将数据变成大写*/
        String s = br.readLine();
        String s1 = s.toUpperCase();
        /*创建输出流,将大写传入客户端*/
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write(s1);
        bw.newLine();
        bw.flush();
        accept.close();
        serverSocket.close();

    }
}
