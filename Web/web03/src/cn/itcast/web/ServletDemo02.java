package cn.itcast.web;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/ServletDemo02")
public class ServletDemo02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决文字乱码问题
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //通过设置消息头Content-Disposition告诉浏览器不要打卡图片
        response.setHeader("Content-Disposition","attachment;filename=ff.jpg");

        //读取服务器上的图片传给浏览器
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(super.getServletContext().getRealPath("itheima.png")));
        ServletOutputStream os = response.getOutputStream();
        byte[]data=new byte[1024];
        int len;
        while((len=bis.read(data))!=-1){
            os.write(data,0,len);
        }
        bis.close();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
