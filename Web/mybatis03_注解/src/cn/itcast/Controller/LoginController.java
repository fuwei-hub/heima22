package cn.itcast.Controller;

import cn.itcast.Service.LoginService;
import cn.itcast.Service.impl.LoginServiceImpl;
import cn.itcast.core.BaseServlet;
import cn.itcast.domain.Login;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController/*")
public class LoginController extends BaseServlet {

    public String userLogin(HttpServletRequest request, HttpServletResponse response)throws Exception{
        //1.获取表单数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        //2.创建service对象
        LoginService loginService = new LoginServiceImpl();
        Login login = loginService.UserLogin(username, password);
        //跳转页面
        System.out.println(login);
        if(login!=null){
            request.getSession().setAttribute("user",login);
            return "SR/success.jsp";
        }else{
            request.setAttribute("error","账号或密码错误，请重新输入");
            return "RD/login.jsp";
        }
    }
}
