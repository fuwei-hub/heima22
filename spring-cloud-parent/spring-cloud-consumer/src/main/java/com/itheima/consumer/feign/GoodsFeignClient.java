package com.itheima.consumer.feign;

import com.itheima.consumer.config.FeignLogConfig;
import com.itheima.consumer.pojo.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-provider", configuration = FeignLogConfig.class)
public interface GoodsFeignClient {

    @GetMapping("goods/findGoods")
    public Goods findById(@RequestParam("id")Integer id);
}
