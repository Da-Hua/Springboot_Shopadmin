package com.bwf.bean.bo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Hua
 */
@Data
@NoArgsConstructor
public class AttrSearchBo {
    private String keyId;
    private String keyName;
    private Integer keyIsSku;
    private Integer keyIsHigh;
    private String createTime;
    private String updateTime;
    private int pageNum;
    private int pageSize;
}
