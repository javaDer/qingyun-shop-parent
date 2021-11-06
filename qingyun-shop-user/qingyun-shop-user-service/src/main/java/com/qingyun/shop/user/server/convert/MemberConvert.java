package com.qingyun.shop.user.server.convert;

import com.qingyun.shop.user.dto.MemberInfoDto;
import com.qingyun.shop.user.server.domain.UmsMember;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author Zhangzhaofa
 */
@Mapper(componentModel = "spring")
public interface MemberConvert {
    /***
     * 转换vo
     * @param member 会员实体
     * @return MemberInfoDto
     */
    @Mapping(source = "create_time", target = "create_time", dateFormat = "yyyy-MM-dd HH:mm:ss")
    MemberInfoDto convertDto(UmsMember member);
}
