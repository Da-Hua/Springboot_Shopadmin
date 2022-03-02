package com.bwf.bean.bo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Author Hua
 */
@Data
@NoArgsConstructor
public class OrderAddBo {
    private int orderId;
    private String orderNo;
    private int orderStatus;
    private double orderSpuAmount;
    private double orderExpressFee;
    private double orderTotalAmount;
    private double orderDiscountAmount;
    private double orderPayAmount;
    private int orderPayMode;
    private int orderPayPlatform;
    private String orderIpAddress;
    private String orderPaymentNo;
    private String orderRemark;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private int orderUserId;
}
