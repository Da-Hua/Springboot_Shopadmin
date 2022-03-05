package com.bwf.bean.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Hua
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {
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
    private String orderRemark;
    private String createTime;
    private String updateTime;
    private Integer orderUserId;
    private User user;
    private OrderAddress orderAddress;
    private OrderDetail orderDetail;
}
