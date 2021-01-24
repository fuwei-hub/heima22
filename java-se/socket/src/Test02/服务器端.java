package Test02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class 服务器端 {
    private static ExecutorService service = Executors.newCachedThreadPool();
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(1000);
        while (true) {
            Socket accept = serverSocket.accept();
            service.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
                        String s = br.readLine();
                        String s1 = s.toUpperCase();
                        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
                        bw.write(s1);
                        bw.newLine();
                        bw.flush();
                        accept.close();
                        serverSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
