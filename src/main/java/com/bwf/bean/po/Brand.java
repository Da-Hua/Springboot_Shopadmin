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
public class Brand {
    private String brandId;
    private String brandName;
    private String brandIntroduction;
    private String brandLogoUrl;
    private Integer sortNo;
    private String createTime;
    private String updateTime;
}
