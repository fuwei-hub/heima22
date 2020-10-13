package tcp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class 测试 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("192.168.15.69", 6666);


        /*1.创建输入流，读取本地文件*/
        FileInputStream fis = new FileInputStream("socket\\src\\IP方法演示.java");
        /*2.创建输出流，指向的是服务器*/
        OutputStream os = socket.getOutputStream();

        byte[] data = new byte[1024];//用于存储读取到的数据
        int len;//用于记录读取了几个数据

        while((len=fis.read(data)) != -1){
            os.write(data,0,len);
        }
        //写入结束符
        socket.shutdownOutput();

        /*6.创建输入流，读取服务器端返回的消息*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String message = reader.readLine();
        System.out.println(message);

        fis.close();
        socket.close();
    }

}
