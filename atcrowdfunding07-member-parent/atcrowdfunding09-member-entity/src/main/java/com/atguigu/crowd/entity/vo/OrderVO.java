package com.atguigu.crowd.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zehao
 * @create 2021-12-11-21:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    // 订单号
    private String orderNum;

    // 支付宝流水单号
    private String payOrderNum;

    // 订单金额
    private Double orderAmount;

    // 是否开发票
    private Integer invoice;

    // 发票抬头
    private String orderRemark;

    private Integer addressId;

    private OrderProjectVO orderProjectVO;

}