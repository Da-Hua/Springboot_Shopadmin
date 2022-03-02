package com.bwf.bean.vo;

import com.bwf.bean.po.Permission;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Hua
 */
@Data
@NoArgsConstructor
public class RolePermissionVo {
    public Integer roleId;
    public String roleName;
    public List<Permission> permissionList;
}
