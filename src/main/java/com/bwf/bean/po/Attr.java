package com.bwf.bean.po;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Hua
 */
@Data
@NoArgsConstructor
public class Attr implements Serializable {
    private String keyId;
    private String keyName;
    private Integer keyIsSku;
    private Integer keyIsHigh;
    private String createTime;
    private String updateTime;
}
