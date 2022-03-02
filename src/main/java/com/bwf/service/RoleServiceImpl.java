package com.bwf.service;

import com.alibaba.fastjson.JSONObject;
import com.bwf.bean.bo.RoleAddBo;
import com.bwf.bean.bo.RoleSearchBo;
import com.bwf.bean.po.Permission;
import com.bwf.bean.po.Role;
import com.bwf.bean.vo.State;
import com.bwf.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Hua
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private PermissionService permissionService;

    @Override
    public int addRole(RoleAddBo bo) {
        return roleMapper.addRole(bo);
    }

    @Override
    public List<Role> getRoleList(RoleSearchBo bo) {
        return roleMapper.getRoleList(bo);
    }

    @Override
    public Role getRoleById(Integer roleId) {
        return roleMapper.getRoleById(roleId);
    }

    @Override
    public List<Permission> getPermissionList(List<Integer> rolePermissionIdList) {
        //1.查出所有权限列表
        List<Permission> list = permissionService.getPermissionList();
        //2.组装父子结构的tree
        //2.1先查找一级权限
        final List<Permission> permissionList = list.stream().filter(permission -> permission.getPid() == null).peek(permission -> {
            setState(null, rolePermissionIdList, permission);
            List<Permission> children = getChildren(permission, list, rolePermissionIdList);
            if (children.size() != 0) {
                permission.setChildren(children);
            }
        }).collect(Collectors.toList());
        System.out.println("permissionList = " + JSONObject.toJSONString(permissionList));
        return permissionList;
    }

    @Override
    public int deleteRole(Integer roleId) {
        return roleMapper.deleteRole(roleId);
    }

    public List<Permission> getChildren(Permission cur, List<Permission> list, List<Integer> rolePermissionIdList) {
        return list.stream().filter(permission -> {
            return permission.getPid() == cur.getPermissionId();
        }).peek(permission -> {
            setState(cur, rolePermissionIdList, permission);
            List<Permission> children = getChildren(permission, list, rolePermissionIdList);
            if (children.size() != 0) {
                permission.setChildren(children);
            }
        }).collect(Collectors.toList());
    }

    private void setState(Permission parent, List<Integer> rolePermissionIdList, Permission children) {
        if (rolePermissionIdList != null && rolePermissionIdList.contains(children.getPermissionId())) {
            State s1 = new State();
            s1.setChecked(true);
            children.setState(s1);
            if (parent != null) {
                State s2 = new State();
                s2.setExpanded(true);
                parent.setState(s2);
            }
        }
    }
}
