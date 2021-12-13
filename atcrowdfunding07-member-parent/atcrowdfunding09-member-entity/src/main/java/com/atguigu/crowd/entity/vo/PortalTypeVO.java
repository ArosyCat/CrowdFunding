package com.atguigu.crowd.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author zehao
 * @create 2021-12-08-14:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PortalTypeVO {

    // 分类id
    private Integer id;
    // 分类名
    private String name;
    // 分类介绍
    private String remark;
    // 各个分类中存放着不同的项目列表
    private List<PortalProjectVO> portalProjectVOList;

}