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
public class Category implements Serializable {
    private Integer cateId;
    private String cateName;
    private Integer cateSort;
    private String createTime;
    private String updateTime;
    private String cateChannel;
    private Integer cateParentId;
}

