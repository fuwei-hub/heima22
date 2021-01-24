package cn.itcast.web.servlet;

import cn.itcast.web.utils.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/LastTimeServlet")
public class LastTimeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        Cookie last = CookieUtils.findCookie("last", request);
        PrintWriter writer = response.getWriter();
        if(last==null){
          writer.println("第一次访问");
        }else{
            String value = last.getValue();
            Date date = new Date(Long.parseLong(value));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss:SSS");
            String format = simpleDateFormat.format(date);
            writer.println("上次访问的时间为"+format);
        }
        Cookie cookie = CookieUtils.addCookie(response, "last", String.valueOf(System.currentTimeMillis()), 60 * 60, "/", "localhost");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
