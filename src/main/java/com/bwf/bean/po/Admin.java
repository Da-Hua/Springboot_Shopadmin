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
public class Admin implements Serializable {
    private String adminId;
    private String adminName;
    private String adminPass;
    private String adminNickname;
}
