package com.itheima.gateway.filter;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.net.InetAddress;
import java.net.InetSocketAddress;

@Component
public class MyFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("id过滤器");
        ServerHttpRequest request = exchange.getRequest();
        ServerHttpResponse response = exchange.getResponse();
        InetSocketAddress remoteAddress = request.getRemoteAddress();
        InetAddress address = remoteAddress.getAddress();
        System.out.println(address);
        System.out.println(remoteAddress.getHostName());
        System.out.println(remoteAddress.getPort());
        if(address.toString().equals("2.2.2.2")){
            response.setStatusCode(HttpStatus.FORBIDDEN);
           return response.setComplete();
        }
        return chain.filter(exchange);
    }

    /**
     * 过滤器排序，数值越小越先执行
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
