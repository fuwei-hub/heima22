package com.itheima.provider.mapper;

import com.itheima.provider.pojo.Goods;
import org.springframework.stereotype.Repository;

@Repository
public class GoodsMapper {

    public Goods findById(Integer id){
        Goods goods = new Goods();
        goods.setId(id);
        goods.setTitle("测试用的商品");
        return  goods;
    }
}
