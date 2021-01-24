package Test02;

import java.io.*;
import java.net.Socket;

public class 客户端 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 1000);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("heLLo");
        //newLine一定要在flush前面
        bw.newLine();
        bw.flush();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = br.readLine();
        System.out.println(s);
        socket.close();
    }
}
