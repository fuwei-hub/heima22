package scoket;

import java.io.*;
import java.net.Socket;

public class Test01 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost",8888);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("🐔你太美");
        bw.newLine();
        bw.flush();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = br.readLine();
        System.out.println(s);
        socket.close();
    }
}
