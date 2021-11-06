package com.qingyun.shop.user.server.provider;

import com.qingyun.shop.common.enums.BaseStatusEnum;
import com.qingyun.shop.common.response.FeignResponse;
import com.qingyun.shop.user.api.MemberApi;
import com.qingyun.shop.user.dto.MemberInfoDto;
import com.qingyun.shop.user.server.convert.MemberConvert;
import com.qingyun.shop.user.server.query.MemberQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author Zhangzhaofa
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class MemberProvider implements MemberApi {
    private final MemberQuery memberQuery;

    public MemberProvider(MemberQuery memberQuery) {
        this.memberQuery = memberQuery;
    }

    @Override
    @RequestMapping(value = "/get/{userId}",method = RequestMethod.GET)
    public FeignResponse<MemberInfoDto> getUserById(@PathVariable(value = "userId") String userId) {
        MemberInfoDto dto = memberQuery.queryMemberInfo(userId);
        return new FeignResponse<>(Boolean.TRUE, BaseStatusEnum.FEIGN_SUCCESS.getCode(),
                BaseStatusEnum.FEIGN_SUCCESS.getMessage(), dto);
    }
}
