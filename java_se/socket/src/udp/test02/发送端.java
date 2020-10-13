package udp.test02;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class 发送端 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        DatagramSocket datagramSocket = new DatagramSocket();
        while (true) {
            String s = sc.nextLine();
            byte[]data=s.getBytes();
            if("886".equals(s)){
                break;
            }
            DatagramPacket datagramPacket = new DatagramPacket(data,0,data.length, InetAddress.getLocalHost(),1000);
            datagramSocket.send(datagramPacket);
        }
        datagramSocket.close();
    }
}
