package tcp;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class 客户端 {
    public static void main(String[] args) throws Exception {
        //创建socket对象
        Socket socket = new Socket("LocalHost",10000);
        //创建输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("后来你好吗?");
        bw.flush();
        //释放资源
        socket.close();
    }
}
