package test.test03;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

//用户端
public class Test01 {
    public static void main(String[] args) throws Exception {
        Socket local = new Socket("localhost", 8888);
        FileInputStream fis = new FileInputStream("socket\\socket.iml");
        OutputStream outputStream = local.getOutputStream();
        byte[] data = new byte[1024];
        int len;
        while ((len = fis.read()) != -1) {
            outputStream.write(data, 0, len);
        }
        outputStream.flush();
        local.shutdownOutput();
        fis.close();
        local.close();
    }
}
