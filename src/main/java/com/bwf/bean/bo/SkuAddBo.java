package com.bwf.bean.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author Hua
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SkuAddBo {
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
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

}

