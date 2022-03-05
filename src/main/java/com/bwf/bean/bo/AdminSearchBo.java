package com.bwf.bean.bo;

import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author Hua
 */
@Data
@NoArgsConstructor
public class AdminSearchBo {
    private String adminId;
    private String adminName;
    private String adminNickname;
    private int pageNum;
    private int pageSize;
}
