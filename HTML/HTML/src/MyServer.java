
package ServiceTest;
        import java.io.*;
        import java.net.ServerSocket;
        import java.net.Socket;
        import java.time.LocalDateTime;
        import java.util.Set;
        import java.util.concurrent.ConcurrentHashMap;
        import java.util.concurrent.CopyOnWriteArrayList;
        import java.util.concurrent.ExecutorService;
        import java.util.concurrent.Executors;

public class MyServer {
    //定义concurrenthashmap
    static ConcurrentHashMap<String, CopyOnWriteArrayList<byte[]>> file = new ConcurrentHashMap<>();

    public static void main(String[] args) throws Exception {
        //服务器启动时间
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        ServerSocket serverSocket = new ServerSocket(10111);


        while (true) {

            Socket socket = serverSocket.accept();
            executorService.submit(new Runnable() {
                @Override
                public void run() {

                    InputStream is = null;
                    PrintStream out = null;
                    try {
                        /*1.获取浏览器要访问的资源的名字*/
                        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        String firstLine = br.readLine();//GET /admin/login.html HTTP/1.1

                        String uri = firstLine.split(" ")[1].substring(1);//  admin/login.html
                        System.out.println(uri);
                        if (file.isEmpty()) {
                            //哈希表中为空 正常读取文件
                            System.out.println(" 哈希表为空 能走通");
                            is = MyServer.class.getClassLoader().getResourceAsStream(uri);
                            //  MyServer.class.getClassLoader()
                            System.out.println(is);
                            //根据需求返回指定文件
                            CopyOnWriteArrayList<byte[]> bytes = returnFile(socket, is);
                            file.put(uri, bytes);
                        } else {
                            System.out.println("哈希表不为空");
                            //获取hashmap中的全部key值
                            Set<String> fileNames = file.keySet();
                            //遍历哈希表中的key
                            int count = 0;
                            for (String fileName : fileNames) {
                                //判断是否存在
                                if (uri.equals(fileName)) {

                                    System.out.println("从缓存中读取");
                                    //存在 从缓存中读取value值并返回
                                    CopyOnWriteArrayList<byte[]> uriFile = file.get(uri);
                                    //传递给客户端
                                    out = new PrintStream(socket.getOutputStream());
                                    out.println("HTTP/1.1 200 OK");
                                    out.println("Content-Type:text/html;charset=utf-8");
                                    out.println();
                                    for (byte[] bytes : uriFile) {
                                        out.write(bytes);
                                        break;
                                    }

                                } else {
                                    count++;
                                }
                            }
                            if (count == fileNames.size()) {

                                System.out.println("iiiiiiiiiiiii");
                                //文件不在hashmap中
                                is = MyServer.class.getClassLoader().getResourceAsStream(uri);
                                //根据需求返回客户端指定文件
                                CopyOnWriteArrayList<byte[]> bytes = returnFile(socket, is);
                                // 并将其缓存到hashmap
                                file.put(uri, bytes);

                            }

                        }
                    } catch (IOException e) {
                        try {
                            CopyOnWriteArrayList<byte[]> temp = returnFile(socket, null);
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        }
                    } finally {
                        if (out != null) {
                            try {
                                out.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        if (is != null) {
                            try {
                                is.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                }
            });


        }

    }

    private static CopyOnWriteArrayList<byte[]> returnFile(Socket socket, InputStream is) throws IOException {
        CopyOnWriteArrayList<byte[]> bufferHashMapValue = new CopyOnWriteArrayList<>();
        System.out.println(is);
        if (is == null || is.equals("favicon.ico")) {

            InputStream rs = MyServer.class.getClassLoader().getResourceAsStream("404.html");
            //传递给客户端
            PrintStream out = new PrintStream(socket.getOutputStream());
            out.println("HTTP/1.1 200 OK");
            out.println("Content-Type:text/html;charset=utf-8");
            out.println();

            byte[] data = new byte[1024];
            int len;
            while ((len = rs.read(data)) != -1) {
                out.write(data, 0, len);
                //将读取到的数据同时放到arraylist中
                bufferHashMapValue.add(data);
            }
            //文件读取完毕 将该Arraylist保存在hashmap中

            //out.close();
            //    socket.close();


            return bufferHashMapValue;
        } else {
            //2.读取资源，将资源写给浏览器

            PrintStream out = new PrintStream(socket.getOutputStream());
            out.println("HTTP/1.1 200 OK");
            out.println("Content-Type:text/html;charset=utf-8");
            out.println();

            byte[] data = new byte[1024];
            int len;
            while ((len = is.read(data)) != -1) {
                out.write(data, 0, len);
                //将读取到的数据同时放到arraylist中
                bufferHashMapValue.add(data);
            }

            //out.close();
            // socket.close();

            return bufferHashMapValue;

        }
    }


}

