package com.bwf.Impl;

import com.bwf.bean.po.Permission;
import com.bwf.mapper.PermissionMapper;
import com.bwf.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hua
 */
@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> getPermissionList() {
        return permissionMapper.getPermissionList();
    }
}
