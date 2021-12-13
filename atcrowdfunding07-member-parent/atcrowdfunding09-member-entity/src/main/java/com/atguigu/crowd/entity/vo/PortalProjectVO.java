package com.atguigu.crowd.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zehao
 * @create 2021-12-08-14:48
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PortalProjectVO {

    // 项目Id
    private Integer projectId;
    // 项目名称
    private String projectName;
    // 头图路径
    private String headerPicturePath;
    // 目标筹集的金额
    private Integer money;
    // 项目部署的日期
    private String deployDate;
    // 完成的百分比
    private Integer percentage;
    // 支持的人数
    private Integer supporter;

}