package cn.itcast.dao;

import cn.itcast.domain.Card;

import java.util.List;

public interface CardDao {
    List<Card>findAll()throws Exception;
}
