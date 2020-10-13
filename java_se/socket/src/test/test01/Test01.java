package test.test01;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;
//客户端
public class Test01 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost",1000);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("这波你学费了吗?");
        bw.newLine();
        bw.flush();
        socket.close();
    }
}
