import java.net.InetAddress;

public class IP方法演示 {
    public static void main(String[] args) throws Exception {
        InetAddress byName = InetAddress.getByName("192.168.15.61");
        System.out.println(byName.getHostAddress());//获得IP地址
        System.out.println(byName.getHostName());//获得主机名
        System.out.println(byName.getAddress());
        System.out.println(InetAddress.getLocalHost());

    }
}
