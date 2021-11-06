package com.qingyun.shop.user.server.query;

import com.qingyun.shop.user.dto.MemberInfoDto;
import com.qingyun.shop.user.server.convert.MemberConvert;
import com.qingyun.shop.user.server.domain.UmsMember;
import com.qingyun.shop.user.server.service.UmsMemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
@Slf4j
public class MemberQuery {
    private final UmsMemberService memberService;
    private final MemberConvert memberConvert;
    public MemberQuery(UmsMemberService memberService,
                       MemberConvert memberConvert) {
        this.memberService = memberService;
        this.memberConvert = memberConvert;
    }

    public MemberInfoDto queryMemberInfo(String userId) {
        UmsMember umsMember = memberService.getById(userId);
        MemberInfoDto memberInfoDto = memberConvert.convertDto(umsMember);
        return memberInfoDto;
    }
}
