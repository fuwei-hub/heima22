package cn.itcast.dao;

import cn.itcast.domain.Classes;

import java.util.List;

public interface ClassesDao {
    List<Classes> findAll()throws Exception;
}
