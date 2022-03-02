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
    public Admin loginDo(@Param("username") String username);

//    @Select("select admin_id adminId, admin_name adminName, admin_pass adminPass, admin_nickname adminNickname from admin")
    public List<Admin> getAdminList(@Param("bo") AdminSearchBo bo);

    @Select("select admin_id adminId, admin_name adminName, admin_pass adminPass, admin_nickname adminNickname from admin where admin_name = #{adminName}")
    public Admin getAdminByName(@Param("adminName") String adminName);

    @Insert("insert into admin(admin_name, admin_pass, admin_nickname) values(#{bo.adminName}, #{bo.adminPass}, #{bo.adminNickname})")
    public int addAdmin(@Param("bo") AdminAddBo bo);

    @Update("update admin set admin_name = #{bo.adminName}, admin_pass = #{bo.adminPass}, admin_nickname = #{bo.adminNickname} where admin_id = #{bo.adminId}")
    public int updateAdmin(@Param("bo") AdminAddBo bo);

//    @Delete("delete from admin where admin_id = #{adminId}")
    @Update("update admin set admin_delete = 1 where admin_id = #{adminId}")
    public int deleteAdmin(@Param("adminId") String adminId);

}
