package com.itheima.provider.controller;

import com.itheima.provider.pojo.Goods;
import com.itheima.provider.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @Value("${itheima}")
    private String itheima;
    @GetMapping("/findGoods")
    public Goods findById(@RequestParam("id")Integer id){
        Goods byId = this.goodsService.findById(id);
        byId.setTitle(itheima+"");
        return byId;
    }
}
