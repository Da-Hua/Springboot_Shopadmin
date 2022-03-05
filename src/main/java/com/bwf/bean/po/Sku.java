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
public class Sku implements Serializable {
    private Long skuId;
    private Long skuSpuId;
    private String skuName;
    private String skuSpuAttr;
    private Double skuPrice;
    private Double skuOriginalPrice;
    private Double skuCostPrice;
    private Integer skuQuantity;
    private Integer sortNo;
    private Integer skuWarningQuantity;
    private Integer skuMaxQuantity;
    private String createTime;
    private String updateTime;
    private Spu spu;
}

