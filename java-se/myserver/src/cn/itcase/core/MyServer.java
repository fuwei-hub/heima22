package cn.itcase.core;



import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class MyServer {
    private static ExecutorService service = Executors.newScheduledThreadPool(9);
    private static ConcurrentHashMap<String, byte[]> map = new ConcurrentHashMap<>();
    //private static Logger LOGGER= LoggerFactory.getLogger(MyServer.class);
    public static void main(String[] args) {
        try {
            //LOGGER.debug("程序开始执行了");
            long l = System.currentTimeMillis();
            ServerSocket ss = new ServerSocket(8080);
            long l1 = System.currentTimeMillis();
            //log.debug("服务器启动成功，端口号是8080,共耗时"+(l1-l)+"毫秒");
            while (true) {
                Socket socket = ss.accept();
                service.submit(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            //接收服务器传来的查看文件的请求
                            String s = new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine();
                            String url = s.split(" ")[1].substring(1);
                            System.out.println(url);
                            //LOGGER.debug("即将访问的资源的名字是:" + url);
                            InputStream stream = MyServer.class.getClassLoader().getResourceAsStream(url);
                            //固定格式,表述输出到浏览器的格式
                            PrintStream out = new PrintStream(socket.getOutputStream());
                            out.println("HTTP/1.1 200 OK");
                            out.println("Content-Type:text/html;charset=utf-8");
                            out.println();
                            //判断传来的文件是在map集合中是否存在
                            if (map.get(url) == null) {
                                //不存在的话读取数据发送给服务器
                                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                                byte[] data = new byte[1024];
                                int len;
                                while ((len = stream.read(data)) != -1) {
                                    baos.write(data, 0, len);
                                }
                                //同时将路径和信息作为map集合的键和值
                                byte[] bytes = baos.toByteArray();
                                map.put(url, bytes);
                            }
                            //若传来的文件咋map集合中是存在的
                            byte[] bytes = map.get(url);
                            //直接从集合中发给服务器
                            out.write(bytes);
                            out.close();
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
