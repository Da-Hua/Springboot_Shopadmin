package com.bwf.mapper;

import com.bwf.bean.bo.AdminAddBo;
import com.bwf.bean.bo.AdminSearchBo;
import com.bwf.bean.po.Admin;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Hua
 */
@Mapper
public interface AdminMapper {

//    @Select("select admin_id adminId, admin_name adminName, admin_pass adminPass, admin_nickname adminNickname from admin where admin_name = #{username}")
    Admin loginDo(@Param("username") String username);

//    @Select("select admin_id adminId, admin_name adminName, admin_pass adminPass, admin_nickname adminNickname from admin")
    List<Admin> getAdminList(@Param("bo") AdminSearchBo bo);

    @Select("select admin_id adminId, admin_name adminName, admin_pass adminPass, admin_nickname adminNickname from admin where admin_name = #{adminName}")
    Admin getAdminByName(@Param("adminName") String adminName);

    @Insert("insert into admin(admin_name, admin_pass, admin_nickname) values(#{bo.adminName}, #{bo.adminPass}, #{bo.adminNickname})")
    int addAdmin(@Param("bo") AdminAddBo bo);

    @Update("update admin a inner join admin_role ar on a.admin_id = ar.admin_id set admin_name #{bo.adminName}, admin_pass = #{bo.adminPass}, admin_nickname = #{bo.adminNickname}, role_id = #{bo.roleId} where a.admin_id = #{bo.adminId}")
    int updateAdmin(@Param("bo") AdminAddBo bo);

//    @Delete("delete from admin where admin_id = #{adminId}")
    @Update("update admin set is_delete = 1 where admin_id = #{adminId}")
    int deleteAdmin(@Param("adminId") String adminId);

    @Insert("insert into admin_role(admin_id, role_id) values(#{bo.adminId}, #{bo.roleId})")
    int addAdminRole(@Param("bo") AdminAddBo bo);
}
