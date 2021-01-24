package cn.itcast.service;

import com.github.pagehelper.PageInfo;

public interface CountyService {

    PageInfo findAll(Integer pagenum,Integer pagesize)throws Exception;
}
