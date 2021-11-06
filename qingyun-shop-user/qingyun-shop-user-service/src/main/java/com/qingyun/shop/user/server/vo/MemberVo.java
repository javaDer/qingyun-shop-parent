package com.qingyun.shop.user.server.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@ApiModel(value = "用户视图对象", description = "订单视图对象")
public class MemberVo {
    /**
     * 订单id
     */
    @ApiModelProperty(name = "id",value = "订单id")
    private Long id;

    /**
     * 用户id
     */
    @ApiModelProperty(name = "memberId",value = "订单id")
    private Long memberId;

    /**
     *
     */
    @ApiModelProperty(name = "id",value = "订单id")
    private Long couponId;

    /**
     * 订单编号
     */
    @ApiModelProperty(name = "orderSn",value = "订单编号")
    private String orderSn;

    /**
     * 提交时间
     */
    @ApiModelProperty(name = "id",value = "订单id")
    private String createTime;

    /**
     * 用户帐号
     */
    @ApiModelProperty(name = "id",value = "订单id")
    private String memberUsername;

    /**
     * 订单总金额
     */
    @ApiModelProperty(name = "id",value = "订单id")
    private BigDecimal totalAmount;

    /**
     * 应付金额（实际支付金额）
     */
    @ApiModelProperty(name = "payAmount",value = "应付金额")
    private BigDecimal payAmount;

    /**
     * 运费金额
     */
    @ApiModelProperty(value = "freight_amount")
    private BigDecimal freightAmount;

    /**
     * 促销优化金额（促销价、满减、阶梯价）
     */
    @ApiModelProperty(value = "promotion_amount")
    private BigDecimal promotionAmount;

    /**
     * 积分抵扣金额
     */
    @ApiModelProperty(value = "integration_amount")
    private BigDecimal integrationAmount;

    /**
     * 优惠券抵扣金额
     */
    @ApiModelProperty(value = "coupon_amount")
    private BigDecimal coupon_amount;

    /**
     * 管理员后台调整订单使用的折扣金额
     */
    @ApiModelProperty(value = "discount_amount")
    private BigDecimal discountAmount;

    /**
     * 支付方式：0->未支付；1->支付宝；2->微信
     */
    @ApiModelProperty(value = "pay_type")
    private Integer payType;

    /**
     * 订单来源：0->PC订单；1->app订单
     */
    @ApiModelProperty(value = "source_type")
    private Integer sourceType;

    /**
     * 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    @ApiModelProperty(value = "status")
    private Integer status;

    /**
     * 订单类型：0->正常订单；1->秒杀订单
     */
    @ApiModelProperty(value = "order_type")
    private Integer orderType;

    /**
     * 物流公司(配送方式)
     */
    @ApiModelProperty(value = "delivery_company")
    private String deliveryCompany;

    /**
     * 物流单号
     */
    @ApiModelProperty(value = "delivery_sn")
    private String deliverySn;

    /**
     * 自动确认时间（天）
     */
    @ApiModelProperty(value = "auto_confirm_day")
    private Integer autoConfirmDay;

    /**
     * 可以获得的积分
     */
    @ApiModelProperty(value = "integration")
    private Integer integration;

    /**
     * 可以活动的成长值
     */
    @ApiModelProperty(value = "growth")
    private Integer growth;

    /**
     * 活动信息
     */
    @ApiModelProperty(value = "promotion_info")
    private String promotionInfo;

    /**
     * 发票类型：0->不开发票；1->电子发票；2->纸质发票
     */
    @ApiModelProperty(value = "bill_type")
    private Integer billType;

    /**
     * 发票抬头
     */
    @ApiModelProperty(value = "bill_header")
    private String billHeader;

    /**
     * 发票内容
     */
    @ApiModelProperty(value = "bill_content")
    private String billContent;

    /**
     * 收票人电话
     */
    @ApiModelProperty(value = "bill_receiver_phone")
    private String billReceiverPhone;

    /**
     * 收票人邮箱
     */
    @ApiModelProperty(value = "bill_receiver_email")
    private String billReceiverEmail;

    /**
     * 收货人姓名
     */
    @ApiModelProperty(value = "receiver_name")
    private String receiverName;

    /**
     * 收货人电话
     */
    @ApiModelProperty(value = "receiver_phone")
    private String receiverPhone;

    /**
     * 收货人邮编
     */
    @ApiModelProperty(value = "receiver_post_code")
    private String receiverPostCode;

    /**
     * 省份/直辖市
     */
    @ApiModelProperty(value = "receiver_province")
    private String receiverProvince;

    /**
     * 城市
     */
    @ApiModelProperty(value = "receiver_city")
    private String receiverCity;

    /**
     * 区
     */
    @ApiModelProperty(value = "receiver_region")
    private String receiverRegion;

    /**
     * 详细地址
     */
    @ApiModelProperty(value = "receiver_detail_address")
    private String receiverDetailAddress;

    /**
     * 订单备注
     */
    @ApiModelProperty(value = "note")
    private String note;

    /**
     * 确认收货状态：0->未确认；1->已确认
     */
    @ApiModelProperty(value = "confirm_status")
    private Integer confirmStatus;

    /**
     * 删除状态：0->未删除；1->已删除
     */
    @ApiModelProperty(value = "delete_status")
    private Integer deleteStatus;

    /**
     * 下单时使用的积分
     */
    @ApiModelProperty(value = "use_integration")
    private Integer useIntegration;

    /**
     * 支付时间
     */
    @ApiModelProperty(value = "payment_time")
    private String paymentTime;

    /**
     * 发货时间
     */
    @ApiModelProperty(value = "delivery_time")
    private String deliveryTime;

    /**
     * 确认收货时间
     */
    @ApiModelProperty(value = "receive_time")
    private String receiveTime;

    /**
     * 评价时间
     */
    @ApiModelProperty(value = "comment_time")
    private String commentTime;

    /**
     * 修改时间
     */
    @ApiModelProperty(value = "modify_time")
    private String modifyTime;
}
