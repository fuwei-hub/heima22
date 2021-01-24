package cn.itcast.controller;

import cn.itcast.core.BaseServlet;
import cn.itcast.core.ResponseBody;
import cn.itcast.domain.City;
import cn.itcast.service.CityService;
import cn.itcast.service.impl.CityServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/CityController/*")
public class CityController extends BaseServlet {

    @ResponseBody
    public Object findByPid(HttpServletRequest request, HttpServletResponse response)throws Exception{
        CityService cityService=new CityServiceImpl();
        String pid = request.getParameter("pid");
        List<City> byPid = cityService.findByPid(pid);
        return byPid;
    }
}
