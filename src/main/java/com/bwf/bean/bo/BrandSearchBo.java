package com.bwf.bean.bo;

import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author Hua
 */
@Data
@NoArgsConstructor
public class BrandSearchBo {
    private String brandId;
    private String brandName;
    private Integer sortNo;
    private String createTime;
    private String updateTime;
    private int pageNum;
    private int pageSize;
}
