package com.bwf.mapper;

import com.bwf.bean.bo.RoleAddBo;
import com.bwf.bean.bo.RoleSearchBo;
import com.bwf.bean.po.Role;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author Hua
 */
@Mapper
public interface RoleMapper {

    List<Role> getRoleList(@Param("bo") RoleSearchBo bo);

    @Insert("insert into role(role_name) values (#{bo.roleName})")
    int addRole(@Param("bo") RoleAddBo bo);

    Role getRoleById(@Param("roleId") Integer roleId);

    @Update("update role set is_delete = 1 where role_id = #{roleId}")
    int deleteRole(@Param("roleId") Integer roleId);
}
