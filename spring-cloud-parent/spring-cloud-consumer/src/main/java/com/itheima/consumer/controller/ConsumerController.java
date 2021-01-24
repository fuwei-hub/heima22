package com.itheima.consumer.controller;

import com.itheima.consumer.feign.GoodsFeignClient;
import com.itheima.consumer.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("order")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private GoodsFeignClient goodsFeignClient;

    @GetMapping("findById")
    public Goods getGoods(@RequestParam Integer id){
        //在eureka-server 获取提供者集
        List<ServiceInstance> instances = this.discoveryClient.getInstances("eureka-provider");

        //通过客户端的负载均衡策略，选择合适的提供者
        ServiceInstance serviceInstance = instances.get(0);
        /*String host = serviceInstance.getHost();
        int port = serviceInstance.getPort();*/
        //String url="http://eureka-provider/itheima/findGoods?id="+id;
        //Goods forObject = this.restTemplate.getForObject(url, Goods.class);
        Goods byId = goodsFeignClient.findById(id);
        return byId;
    }
}
