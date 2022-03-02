package com.bwf.bean.bo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Hua
 */
@Data
@NoArgsConstructor
public class RoleSearchBo {
    private Integer roleId;
    private String roleName;
    private int pageNum;
    private int pageSize;
}
