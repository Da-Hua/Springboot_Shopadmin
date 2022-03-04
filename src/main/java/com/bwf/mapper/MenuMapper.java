package com.bwf.mapper;

import com.bwf.bean.po.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Hua
 */
@Mapper
public interface MenuMapper {

    @Select("SELECT m.menu_id menuId,m.menu_name menuName,m.menu_url menuUrl,m.pid pid " +
            "FROM `admin` a " +
            "INNER JOIN `admin_role` ar ON a.admin_id = ar.admin_id " +
            "INNER JOIN `role` r ON ar.role_id = r.role_id " +
            "INNER JOIN `role_permission` rp ON r.role_id = rp.role_id " +
            "INNER JOIN `permission` p ON rp.permission_id = p.permission_id " +
            "INNER JOIN `permission_menu` pm ON p.permission_id = pm.permission_id " +
            "INNER JOIN `menu` m ON pm.menu_id = m.menu_id " +
            "WHERE a.admin_id = #{adminId}")
    List<Menu> getMenuListByAdminId(@Param("adminId") int adminId);
}
