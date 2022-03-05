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
public class OrderAddress implements Serializable {
    private Integer oaId;
    private String orderNo;
    private String consignee;
    private String phone;
    private String province;
    private String city;
    private String district;
    private String address;
    private String updateTime;
}

