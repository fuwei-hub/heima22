package tcp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class 服务器 {
    public static void main(String[] args)  throws Exception{
        /*创建ServerSocket对象*/
        ServerSocket serverSocket = new ServerSocket(10000);
        /*通过调用accept方法创建Scoket对象*/
        Socket accept = serverSocket.accept();
        /*创建输入流对象*/
        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        /*读取数据*/
        String s = br.readLine();
        System.out.println(s);
        /*释放资源*/
        br.close();
        serverSocket.close();
    }
}
