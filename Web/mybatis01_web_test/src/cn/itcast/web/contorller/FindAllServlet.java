package cn.itcast.web.contorller;

import cn.itcast.core.BaseServlet;
import cn.itcast.domain.Host;
import cn.itcast.service.RentInfoService;
import cn.itcast.service.impl.RentInfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/FindAllServlet/*")
public class FindAllServlet extends BaseServlet {
    private RentInfoService rentInfoService=new RentInfoServiceImpl();
   public void findAll(HttpServletRequest request,HttpServletResponse response)throws Exception{
       List<Host> all = rentInfoService.findAll();
       request.setAttribute("list",all);
       request.getRequestDispatcher("/list.jsp").forward(request,response);
   }
}
