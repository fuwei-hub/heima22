package tcp.tcp转大写;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class 客户端 {
    public static void main(String[] args)  throws Exception{
        Socket socket = new Socket("localhost",8888);
        /*创建输出流,向服务器端写字母*/
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("heLLo");
        bw.newLine();
        bw.flush();
        /*创建输入流,接收大写的数据*/
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = br.readLine();
        System.out.println(s);

        socket.close();
    }
}
