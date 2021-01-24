package com.itheima.provider.service;

import com.itheima.provider.mapper.GoodsMapper;
import com.itheima.provider.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    public Goods findById(Integer id){
       return this.goodsMapper.findById(id);
    }
}
