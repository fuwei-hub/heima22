package cn.itcast.controller;

import cn.itcast.core.BaseServlet;
import cn.itcast.core.ResponseBody;
import cn.itcast.domain.ProvinceRedis;
import cn.itcast.service.ProvinceService;
import cn.itcast.service.impl.ProvinceServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@WebServlet("/ProvinceController/*")
public class ProvinceController extends BaseServlet {

    @ResponseBody
    public Object findAll(HttpServletRequest request, HttpServletResponse response)throws Exception{
        ProvinceService provinceService = new ProvinceServiceImpl();
        List<ProvinceRedis> all = provinceService.findAll();
       return all;
    }
}
