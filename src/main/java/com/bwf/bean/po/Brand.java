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
public class Brand implements Serializable {
    private String brandId;
    private String brandName;
    private String brandIntroduction;
    private String brandLogoUrl;
    private Integer sortNo;
    private String createTime;
    private String updateTime;
}
