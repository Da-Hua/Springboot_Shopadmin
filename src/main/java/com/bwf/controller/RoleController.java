package com.bwf.controller;

import com.alibaba.fastjson.JSONObject;
import com.bwf.bean.bo.RoleAddBo;
import com.bwf.bean.bo.RoleSearchBo;
import com.bwf.bean.po.Permission;
import com.bwf.bean.po.Role;
import com.bwf.service.RoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Hua
 */
@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/admin")
    public String admin(RoleSearchBo bo, ModelMap map) {
        PageHelper.startPage(bo.getPageNum() == 0 ? 1 : bo.getPageNum(), bo.getPageSize() == 0 ? 5 : bo.getPageSize());
        final List<Role> roleList = roleService.getRoleList(bo);
        final PageInfo<Role> pageInfo = new PageInfo<>(roleList);
        map.addAttribute("pageInfo", pageInfo);
        return "role/admin";
    }

    @RequestMapping("/add")
    public String add(ModelMap map) {
        final List<Permission> permissionList = roleService.getPermissionList(null);
        map.addAttribute("permissionList", JSONObject.toJSONString(permissionList));
        return "role/add";
    }

    @RequestMapping("/save")
    public String save(RoleAddBo bo, ModelMap map) {
        if (roleService.addRole(bo) == 1) {
            map.addAttribute("messages", "角色添加成功!");
            map.addAttribute("back", "/role/admin");
            return "common/success";
        } else {
            map.addAttribute("messages", "角色添加失败!");
            map.addAttribute("back", "/role/add");
            return "common/error";
        }
    }

    @RequestMapping("/getRoleById")
    public String getRoleById(int roleId, ModelMap map) {
        Role role = roleService.getRoleById(roleId);
        List<Integer> list = null;
        if (StringUtil.isNotEmpty(role.getPermissionId())) {
            List<String> permissionIdsList = Arrays.asList(role.getPermissionId().split(","));
            list = permissionIdsList.stream().map(Integer::parseInt).collect(Collectors.toList());
        }
        List<Permission> permissionList = roleService.getPermissionList(list);
        map.addAttribute("permissionList", JSONObject.toJSONString(permissionList));
        map.addAttribute("role", role);
        return "role/update";
    }

    @RequestMapping("/deleteRole")
    public String deleteRole(Integer roleId, ModelMap map) {
        map.addAttribute("back", "/role/admin");
        if (roleService.deleteRole(roleId) == 1) {
            return "common/success";
        } else {
            return "common/error";
        }
    }
}
