package com.bwf.bean.bo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Author Hua
 */
@Data
@NoArgsConstructor
public class BrandAddBo {
    private String brandId;
    private String brandName;
    private String brandIntroduction;
    private String brandLogoUrl;
    private int sortNo;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
