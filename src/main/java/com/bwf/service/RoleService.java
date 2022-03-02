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

    public int addRole(RoleAddBo bo);

    public List<Role> getRoleList(RoleSearchBo bo);

    public Role getRoleById(Integer roleId);

    public List<Permission> getPermissionList(List<Integer> rolePermissionIdList);

    public int deleteRole(Integer roleId);
}
