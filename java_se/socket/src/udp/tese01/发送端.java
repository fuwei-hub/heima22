package udp.tese01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class 发送端 {
    public static void main(String[] args) throws Exception {
        //准备数据
        byte[] bytes = "早上喝了二两".getBytes();
        //数据打包
        DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length, InetAddress.getByName("192.168.15.69"),10000);
        //创建Socket对象
        DatagramSocket datagramSocket = new DatagramSocket();
        //发送数据
        datagramSocket.send(datagramPacket);
        //释放资源
        datagramSocket.close();
    }
}
