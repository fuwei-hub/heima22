package Test01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.OutputStream;
import java.net.Socket;

//客户端
public class 客户端 {
    public static void main(String[] args)throws Exception {
        Socket localhost = new Socket("localhost", 8888);
        OutputStream os = localhost.getOutputStream();
        os.write('a');
        os.flush();
        localhost.close();
    }
}
