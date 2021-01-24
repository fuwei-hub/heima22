package cn.itcast.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JumpServlet/*")
public class JumpServlet extends BaseServlet {

    protected void jump(HttpServletRequest request,HttpServletResponse response) throws Exception{
        response.getWriter().println("跳一支");
    }


    protected void sing(HttpServletRequest request,HttpServletResponse response)throws Exception{
        response.getWriter().println("唱一首");
    }
}
