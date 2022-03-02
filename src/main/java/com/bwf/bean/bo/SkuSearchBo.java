package com.bwf.bean.bo;

import com.bwf.bean.po.Spu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Hua
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SkuSearchBo {
    private Long skuId;
    private Long skuSpuId;
    private String skuName;
    private Spu spu;
    private int pageNum;
    private int pageSize;

}

