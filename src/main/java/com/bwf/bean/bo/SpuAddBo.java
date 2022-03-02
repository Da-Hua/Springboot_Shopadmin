package com.bwf.bean.bo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Hua
 */
@Data
@NoArgsConstructor
public class SpuAddBo {
    private String spuName;
    private String spuTitle;

    private String spuUnit;
    private String spuSpecs;
    private Integer spuSkuType;
    private Integer spuStatus;
    private String createTime;
    private String updateTime;
    private String spuBrandId;
    private Integer cateId;
    private String spuIntroduction;
}
