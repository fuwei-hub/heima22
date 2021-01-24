package cn.itcast.service;

import cn.itcast.domain.County;

import java.util.List;


public interface CountyService {

    List<County> findByName(String name)throws Exception;
}
