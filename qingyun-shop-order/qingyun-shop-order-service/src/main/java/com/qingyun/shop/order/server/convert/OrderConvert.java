package com.qingyun.shop.order.server.convert;

import com.qingyun.shop.order.server.domain.OmsOrder;
import com.qingyun.shop.order.server.vo.OrderVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author Zhangzhaofa
 */
@Mapper(componentModel = "spring")
public interface OrderConvert {
    /**
     * convertVo 转换vo
     * @param order 订单实体
     * @return OrderVo
     */
    @Mapping(source = "receiveTime",target = "receiveTime",dateFormat = "yyyy-MM-dd HH:mm:ss")
    OrderVo convertVo(OmsOrder order);
}
