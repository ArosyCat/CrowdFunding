package com.atguigu.crowd.service.api.impl;

import com.atguigu.crowd.entity.po.MemberPO;
import com.atguigu.crowd.entity.po.MemberPOExample;
import com.atguigu.crowd.mapper.MemberPOMapper;
import com.atguigu.crowd.service.api.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zehao
 * @create 2021-11-29-17:06
 */
@Service
// 开启声明式事务功能
@Transactional(readOnly = true)
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberPOMapper memberPOMapper;

    @Override
    public MemberPO getMemberPOByLoginAcct(String loginAcct) {
        // 1.创建Example对象
        MemberPOExample example = new MemberPOExample();
        // 2.创建Criteria对象
        MemberPOExample.Criteria criteria = example.createCriteria();
        // 3.封装查询条件
        criteria.andLoginacctEqualTo(loginAcct);
        // 4.执行查询
        List<MemberPO> memberPOS = memberPOMapper.selectByExample(example);
        // 5.获取结果
        if (memberPOS == null || memberPOS.size() == 0) {
            return null;
        }

        return memberPOS.get(0);
    }

    @Transactional(
            propagation = Propagation.REQUIRES_NEW,
            rollbackFor = Exception.class,
            readOnly = false
    )
    @Override
    public void saveMember(MemberPO memberPO) {
        memberPOMapper.insertSelective(memberPO);
    }
}