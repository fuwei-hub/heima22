package cn.itcast.dao;

import cn.itcast.domain.Host;

import java.util.List;

public interface RentInfoDao {
    List<Host> findAll()throws Exception;
}
