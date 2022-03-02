package com.bwf.bean.bo;

import com.bwf.bean.po.OrderAddress;
import com.bwf.bean.po.OrderDetail;
import com.bwf.bean.po.User;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author Hua
 */
@Data
@NoArgsConstructor
public class OrderSearchBo {
    private Integer orderId;
    private String orderNo;
    private Integer orderStatus;
    private Double orderSpuAmount;
    private Double orderExpressFee;
    private Double orderTotalAmount;
    private Double orderDiscountAmount;
    private Double orderPayAmount;
    private Integer orderPayMode;
    private Integer orderPayPlatform;
    private String orderIpAddress;
    private String orderPaymentNo;
    private String createTime;
    private String updateTime;
    private Integer orderUserId;
    private User user;
    private OrderAddress orderAddress;
    private OrderDetail orderDetail;
    private int pageNum;
    private int pageSize;
}
