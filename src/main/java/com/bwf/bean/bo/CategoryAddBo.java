package com.bwf.bean.bo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


/**
 * @author Hua
 */
@Data
@NoArgsConstructor
public class CategoryAddBo {
    private String cateName;
    private Integer cateSort;
    private Integer cateParentId;
    private List<String> brandList;
    private List<String> attrList;

}
