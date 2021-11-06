package com.qingyun.shop.user.api;

import com.qingyun.shop.common.response.FeignResponse;
import com.qingyun.shop.user.dto.MemberInfoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Zhangzhaofa
 */
@FeignClient(name = "qingyun-user-server",path = "/user")
public interface MemberApi {
    /**
     * 获取用户信息
     *
     * @param userId 用户ID
     * @return FeignResponse<MemberInfoDto>
     */
    @GetMapping("/get/{userId}")
    FeignResponse<MemberInfoDto> getUserById(@PathVariable(value = "userId") String userId);

}
