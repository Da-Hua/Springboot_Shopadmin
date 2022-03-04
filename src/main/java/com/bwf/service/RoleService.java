package com.bwf.service;

import com.bwf.bean.bo.RoleAddBo;
import com.bwf.bean.bo.RoleSearchBo;
import com.bwf.bean.po.Permission;
import com.bwf.bean.po.Role;

import java.util.List;

/**
 * @author Hua
 */
public interface RoleService {

    int addRole(RoleAddBo bo);

    List<Role> getRoleList(RoleSearchBo bo);

    Role getRoleById(Integer roleId);

    List<Permission> getPermissionList(List<Integer> rolePermissionIdList);

    int deleteRole(Integer roleId);
}
