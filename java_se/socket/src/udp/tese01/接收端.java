package udp.tese01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class 接收端 {
    public static void main(String[] args) throws Exception {
        System.out.println("接收端运行了");
        //创建数组
        byte[]data=new byte[1024];
        //创建包
        DatagramPacket datagramPacket = new DatagramPacket(data, 0, data.length);
        //创建Socket对象
        DatagramSocket datagramSocket = new DatagramSocket(1024);
        //接收数据
        datagramSocket.receive(datagramPacket);
        System.out.println(new String(data,0,datagramPacket.getLength()));

        //释放资源
        datagramSocket.close();
    }
}
