package com.qingyun.shop.order.server.controller;

import com.qingyun.shop.common.enums.BaseStatusEnum;
import com.qingyun.shop.common.response.BaseResponse;
import com.qingyun.shop.order.server.query.OrderQuery;
import com.qingyun.shop.order.server.vo.OrderVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author Zhangzhaofa
 */
@Slf4j
@RestController
@RequestMapping("/order")
@Api(value = "订单相关接口", tags = "订单相关接口")
public class OrderControllers {
    private final OrderQuery orderQuery;

    public OrderControllers(OrderQuery orderQuery) {
        this.orderQuery = orderQuery;
    }

    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取订单详细信息", httpMethod = "GET", response = OrderVo.class)
    public BaseResponse<OrderVo> selectOrderInfo(@ApiParam(value = "当前登录人token", type = "String", required = true)
                                                 @RequestHeader("token") String token,
                                                 @ApiParam(value = "id", type = "String", required = true)
                                                 @PathVariable("id") String id) {
        Optional<OrderVo> result = Optional.ofNullable(orderQuery.selectOrderInfo(id));
        return result.map(roomStateVos -> new BaseResponse<>(
                        Boolean.TRUE, BaseStatusEnum.SUCCESS.getCode(), BaseStatusEnum.SUCCESS.getMessage(), roomStateVos))
                .orElseGet(() -> new BaseResponse<>(
                        Boolean.FALSE, BaseStatusEnum.FAILED.getCode(), "获取订单详细信息为空！", null));
    }
}
