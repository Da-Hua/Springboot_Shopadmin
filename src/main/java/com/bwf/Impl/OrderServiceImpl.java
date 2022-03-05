package com.bwf.Impl;

import com.bwf.bean.bo.OrderSearchBo;
import com.bwf.bean.po.Order;
import com.bwf.mapper.OrderMapper;
import com.bwf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Hua
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> getOrderList(OrderSearchBo bo) {
        return orderMapper.getOrderList(bo);
    }

    @Override
    public int saveOrder(OrderSearchBo bo) {
        bo.setUpdateTime(String.valueOf(LocalDateTime.now()));
        return orderMapper.saveOrder(bo);
    }


}
