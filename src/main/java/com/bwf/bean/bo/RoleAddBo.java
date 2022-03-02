package com.bwf.bean.bo;

import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author Hua
 */
@Data
@NoArgsConstructor
public class RoleAddBo {
    private String roleName;
    private String permissionId;
}
