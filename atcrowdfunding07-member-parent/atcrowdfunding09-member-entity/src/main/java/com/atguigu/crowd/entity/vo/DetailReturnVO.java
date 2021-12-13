package com.atguigu.crowd.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zehao
 * @create 2021-12-08-17:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailReturnVO {

    // 回报信息主键
    private Integer returnId;
    // 当前档位需要支持的金额
    private Integer supportMoney;
    // 单笔限购，取值为0时无限额，取值为1时有限额
    private Integer signalPurchase;
    // 具体限额的数量
    private Integer purchase;
    // 当前该档位支持者的数量
    private Integer supporterCount;
    // 运费，取值为0时表示包邮
    private Integer freight;
    // 众筹成功后多少天发货
    private Integer returnDate;
    // 回报内容
    private String content;


}