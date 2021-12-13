package com.atguigu.crowd.service.api;

import com.atguigu.crowd.entity.vo.AddressVO;
import com.atguigu.crowd.entity.vo.OrderProjectVO;
import com.atguigu.crowd.entity.vo.OrderVO;

import java.util.List;

/**
 * @author zehao
 * @create 2021-12-09-21:20
 */
public interface OrderService {

    OrderProjectVO getOrderProjectVO(Integer projectId,Integer returnId);

    List<AddressVO> getAddressVOList(Integer memberId);

    void saveAddress(AddressVO addressVO);

    void saveOrder(OrderVO orderVO);
}