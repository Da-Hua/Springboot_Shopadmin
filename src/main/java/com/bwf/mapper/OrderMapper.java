package com.bwf.mapper;

import com.bwf.bean.bo.OrderSearchBo;
import com.bwf.bean.po.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author Hua
 */
@Mapper
public interface OrderMapper {

    List<Order> getOrderList(@Param("bo") OrderSearchBo bo);

    @Update("update `order` set order_status = #{bo.orderStatus}, updatetime = #{bo.updateTime} where id = #{bo.orderId}")
    int saveOrder(@Param("bo") OrderSearchBo bo);
}
