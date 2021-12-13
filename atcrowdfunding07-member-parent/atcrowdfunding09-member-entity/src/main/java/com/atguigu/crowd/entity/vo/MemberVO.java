package com.atguigu.crowd.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author zehao
 * @create 2021-12-02-10:55
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberVO {

    private String loginacct;

    private String userpswd;

    private String username;

    private String email;

    private String phone;

    private String code;

}