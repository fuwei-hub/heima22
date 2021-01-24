package cn.itcast.controller;

import cn.itcast.core.BaseServlet;
import cn.itcast.domain.Login;
import cn.itcast.domain.Person;
import cn.itcast.service.LoginService;
import cn.itcast.service.PersonService;
import cn.itcast.service.impl.LoginServiceImpl;
import cn.itcast.service.impl.PersonServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/LoginController/*")
public class LoginController extends BaseServlet {
    private LoginService loginService=new LoginServiceImpl();
    private PersonService personService=new PersonServiceImpl();
    public String login(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Login login = loginService.login(username, password);
        if(login!=null){
            //登录成功  展示数据
            List<Person> all = personService.findAll();
            request.getSession().setAttribute("person",all);
            return "SR/list.jsp";
        }else{
            request.setAttribute("error","用户名或密码错误");
           /* request.getRequestDispatcher("/login.jsp").forward(request,response);*/
            return "RD/login.jsp";
        }
    }
}
