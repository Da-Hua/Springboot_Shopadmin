package com.bwf.bean.po;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Hua
 */
@Data
@NoArgsConstructor
public class Attr {
    private String keyId;
    private String keyName;
    private Integer keyIsSku;
    private Integer keyIsHigh;
    private String createTime;
    private String updateTime;
}
