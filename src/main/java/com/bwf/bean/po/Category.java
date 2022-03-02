package com.bwf.bean.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Hua
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    private Integer cateId;
    private String cateName;
    private Integer cateSort;
    private String createTime;
    private String updateTime;
    private String cateChannel;
    private Integer cateParentId;
}

