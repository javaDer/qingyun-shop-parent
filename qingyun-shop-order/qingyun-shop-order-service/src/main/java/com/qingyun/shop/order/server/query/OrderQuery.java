package com.qingyun.shop.order.server.query;

import com.qingyun.shop.order.server.Remote.RemoteApi;
import com.qingyun.shop.order.server.convert.OrderConvert;
import com.qingyun.shop.order.server.domain.OmsOrder;
import com.qingyun.shop.order.server.service.OmsOrderService;
import com.qingyun.shop.order.server.vo.OrderVo;
import com.qingyun.shop.user.dto.MemberInfoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

/**
 *
 */
@Service
@Slf4j
public class OrderQuery {
    @Resource
    private OmsOrderService orderService;
    @Resource
    private RemoteApi remoteApi;
    @Resource
    private OrderConvert orderConvert;

    public OrderVo selectOrderInfo(String id) {
        OmsOrder omsOrder = orderService.getById(id);
        if (Objects.nonNull(omsOrder)) {
            MemberInfoDto memberInfoDto = remoteApi.queryMemberInfo(omsOrder.getMemberId().toString());
            //获取用户信息
            OrderVo orderVo = orderConvert.convertVo(omsOrder);
            if (Objects.nonNull(memberInfoDto)) {
                orderVo.setMemberInfo(memberInfoDto);
            }
            return orderVo;
        }
        return null;
    }
}
