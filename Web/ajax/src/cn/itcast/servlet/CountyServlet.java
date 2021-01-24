package cn.itcast.servlet;

import cn.itcast.core.BaseServlet;
import cn.itcast.core.ResponseBody;
import cn.itcast.domain.County;
import cn.itcast.service.CountyService;
import cn.itcast.service.impl.CountyServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@WebServlet("/CountyServlet/*")
public class CountyServlet extends BaseServlet {
private CountyService countyService=new CountyServiceImpl();

    @ResponseBody
    public Object findByName(HttpServletRequest request, HttpServletResponse response)throws Exception{
        String name = request.getParameter("wd");
        System.out.println(name);
        List<County> list = countyService.findByName(name);
        return list;
    }
}
