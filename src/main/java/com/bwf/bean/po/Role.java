package com.bwf.bean.po;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Hua
 */
@Data
@NoArgsConstructor
public class Role {
    private Integer roleId;
    private String roleName;
    private String permissionId;
}
