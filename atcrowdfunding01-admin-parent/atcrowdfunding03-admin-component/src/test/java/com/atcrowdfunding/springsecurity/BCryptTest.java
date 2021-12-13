package com.atcrowdfunding.springsecurity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author zehao
 * @create 2021-11-24-15:02
 */
public class BCryptTest {

    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = "123123";
        String encode = passwordEncoder.encode(password);
        System.out.println(encode);

    }

}