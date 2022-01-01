package com.qingyun.shop.shenyu.gateway.filter;

import org.springframework.core.annotation.Order;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

@Component
@Order(-98)
public class RpcSpringCloudHeadFilter implements WebFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain chain) {
        ServerHttpRequest rpcType = exchange.getRequest().mutate().header("rpc_type", "springCloud").build();
        ServerWebExchange build = exchange.mutate().request(rpcType).build();
        return chain.filter(build);
    }
}
