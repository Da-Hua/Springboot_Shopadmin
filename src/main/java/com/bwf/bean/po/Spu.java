package com.bwf.bean.po;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author Hua
 */
@Data
@NoArgsConstructor
public class Spu implements Serializable {
    private Long spuId;
    private String spuName;
    private String spuTitle;
    private String spuIntroduction;
    private String spuUnit;
    private Integer spuSketchType;
    private String spuSketch;
    private String spuSpecs;
    private Integer spuSkuType;
    private Integer spuStatus;
    private String createTime;
    private String updateTime;
    private String spuBrandId;
    private Brand brand;
    private Category category;
    private List<Category> categoryList;
}
