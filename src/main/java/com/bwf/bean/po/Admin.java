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
public class Admin {
    private int adminId;
    private String adminName;
    private String adminPass;
    private String adminNickname;
}
