package udp.test02;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class 接收端 {
    public static void main(String[] args)  throws Exception{
        DatagramSocket datagramSocket = new DatagramSocket(1000);
        while (true) {
            byte[]data=new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(data,0,data.length);
            datagramSocket.receive(datagramPacket);
            System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));
        }
    }
}
