package com.bwf.bean.bo;

import com.bwf.bean.po.Brand;
import com.bwf.bean.po.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Hua
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpuSearchBo {
    private Long spuId;
    private String spuName;
    private String spuUnit;
    private String spuSpecs;
    private Integer spuStatus;
    private String updateTime;
    private String spuBrandId;
    private Brand brand;
    private List<Category> categoryList;
    private int pageNum;
    private int pageSize;
}

