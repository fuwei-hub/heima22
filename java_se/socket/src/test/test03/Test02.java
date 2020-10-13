package test.test03;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

//服务端
public class Test02 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        FileOutputStream fos = new FileOutputStream("socket\\socket.iml.bak");
        byte[] data = new byte[1024];
        int len;
        while ((len = inputStream.read()) != -1) {
            fos.write(data, 0, len);
        }
        fos.flush();
        fos.close();
        accept.close();
        serverSocket.close();
    }
}
