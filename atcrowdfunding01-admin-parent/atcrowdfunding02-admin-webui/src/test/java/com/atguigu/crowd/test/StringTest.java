package com.atguigu.crowd.test;

import com.atguigu.crowd.util.CrowdUtil;
import org.junit.Test;

/**
 * @author zehao
 * @create 2021-11-08-9:33
 */
public class StringTest {

    @Test
    public void testMD5(){
        String source = "123123";
        String encoded = CrowdUtil.md5(source);
        System.out.println(encoded);
    }

}