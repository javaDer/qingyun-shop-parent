package com.qingyun.shop.order.server.Remote;

import com.qingyun.shop.common.enums.BaseStatusEnum;
import com.qingyun.shop.common.response.FeignResponse;
import com.qingyun.shop.user.api.MemberApi;
import com.qingyun.shop.user.dto.MemberInfoDto;
import org.springframework.stereotype.Service;

/**
 * @author Zhangzhaofa
 */
@Service
public class RemoteApi {
    private final MemberApi memberApi;

    public RemoteApi(MemberApi memberApi) {
        this.memberApi = memberApi;
    }

    public MemberInfoDto queryMemberInfo(String memberId) {
        FeignResponse<MemberInfoDto> result = memberApi.getUserById(memberId);
        if (BaseStatusEnum.FEIGN_SUCCESS.getCode().equals(result.getCode())) {
            return result.getData();
        }
        return null;
    }
}
