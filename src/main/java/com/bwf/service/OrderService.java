package com.bwf.service;

import com.bwf.bean.bo.OrderSearchBo;
import com.bwf.bean.po.Order;

import java.util.List;

/**
 * @author Hua
 */
public interface OrderService {

    public List<Order> getOrderList(OrderSearchBo bo);

    public int saveOrder(OrderSearchBo bo);
}
