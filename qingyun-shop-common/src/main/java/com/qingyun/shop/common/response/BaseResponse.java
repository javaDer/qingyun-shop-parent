package com.qingyun.shop.common.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

/**
 * 统一返回数据结构
 * @author 张兆发
 */
@Getter
@AllArgsConstructor
@ApiModel(value = "BaseResponse", description = "API统一响应对象")
public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = -8818797449687585082L;

    @ApiModelProperty(value = "业务是否成功", notes = "前端可根据此值进行最快的判断.若业务失败,该值为false,成功则一定为true")
    private final Boolean success;
    @ApiModelProperty(value = "响应代码", notes = "详情请查看设计文档附录:响应代码列表")
    private final String code;
    @ApiModelProperty(value = "响应消息")
    private final String msg;
    @ApiModelProperty(value = "响应数据", notes = "本次响应所返回的数据对象")
    private final T data;

}