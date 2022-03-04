package com.bwf.mapper;

import com.bwf.bean.po.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Hua
 */
@Mapper
public interface PermissionMapper {

    @Select("select permission_id permissionId, permission_name permissionName, pid from permission")
    List<Permission> getPermissionList();
}
