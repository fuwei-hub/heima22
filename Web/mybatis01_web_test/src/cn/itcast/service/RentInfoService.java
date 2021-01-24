package cn.itcast.service;

import cn.itcast.domain.Host;

import java.util.List;

public interface RentInfoService {
    List<Host> findAll()throws Exception;
}
