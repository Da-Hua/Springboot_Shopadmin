package com.bwf.bean.bo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Hua
 */
@Data
@NoArgsConstructor
public class AdminAddBo {
    private String adminId;
    private String adminName;
    private String adminPass;
    private String adminNickname;
    private Integer roleId;
}
