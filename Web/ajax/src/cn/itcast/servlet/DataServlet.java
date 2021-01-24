package cn.itcast.servlet;

import cn.itcast.core.BaseServlet;
import cn.itcast.core.ResponseBody;
import cn.itcast.domain.County;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@WebServlet("/DataServlet/*")
public class DataServlet extends BaseServlet {

    public  void getData(HttpServletRequest request, HttpServletResponse response )throws Exception{
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String age = request.getParameter("age");
        System.out.println(username);
        System.out.println(password);
        System.out.println(age);
        response.getWriter().print("didi");
    }

    @ResponseBody
    public Object getJeson(HttpServletRequest request,HttpServletResponse response)throws Exception{
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String age = request.getParameter("age");
        System.out.println(username+","+password+","+age);
        ArrayList<County> counties = new ArrayList<>();
        counties.add(new County("张三",23));
        counties.add(new County("赵四",24));
        counties.add(new County("王五",25));
        return counties;
    }
}
