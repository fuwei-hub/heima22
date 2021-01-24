package cn.itcast.controller;

import cn.itcast.core.BaseServlet;
import cn.itcast.core.ResponseBody;
import cn.itcast.service.CountyService;
import cn.itcast.service.impl.CountyServiceImpl;
import com.github.pagehelper.PageInfo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CountryController/*")
public class CountryController extends BaseServlet {

    @ResponseBody
    public Object findAll(HttpServletRequest request, HttpServletResponse response)throws Exception{
        String pageNum = request.getParameter("pageNum");
        String pageSize = request.getParameter("pageSize");
        CountyService countyService=new CountyServiceImpl();
        PageInfo all = countyService.findAll(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
        return all;
    }
}
