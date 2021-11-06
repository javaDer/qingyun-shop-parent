package com.qingyun.shop.common.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 类名称：PageResponse<br>
 * 类描述：分页数据返回体<br>
 * 创建时间：2021年9月29日 21:41:19<br>
 *
 * @author 张兆发
 * @version 1.0.0
 */
@Getter
public class PageResponse<T> extends BaseResponse implements Serializable {

    private static final long serialVersionUID = -7480210460787655744L;

    public PageResponse(Boolean success, String resultCode, String resultMsg, T resultData) {
        super(success, resultCode, resultMsg, resultData);
    }

    /**
     * 当前页数
     */
    @Setter
    private Integer page;
    /**
     * 每页条数
     */
    @Setter
    private Integer size;
    /**
     * 总条数
     */
    @Setter
    private Long total;
}