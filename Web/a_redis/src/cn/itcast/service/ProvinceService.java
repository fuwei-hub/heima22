package cn.itcast.service;

import cn.itcast.domain.ProvinceRedis;

import java.util.List;

public interface ProvinceService {
    List<ProvinceRedis>findAll()throws Exception;
}
