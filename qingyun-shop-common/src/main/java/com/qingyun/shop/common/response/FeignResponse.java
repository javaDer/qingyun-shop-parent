package com.qingyun.shop.common.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author Zhangzhaofa
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(value = "Feign接口统一数据结构对象", description = "Feign接口统一数据结构对象")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class FeignResponse<T> implements Serializable {
    private static final long serialVersionUID = -2256888657487507964L;

    @ApiModelProperty(value = "业务是否成功", notes = "前端可根据此值进行最快的判断.若业务失败,该值为false,成功则一定为true")
    private Boolean success;
    @ApiModelProperty(value = "响应代码", notes = "详情请查看设计文档附录:响应代码列表")
    private String code;
    @ApiModelProperty(value = "响应消息")
    private String msg;
    @ApiModelProperty(value = "响应数据", notes = "本次响应所返回的数据对象")
    private T data;
}