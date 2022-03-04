package com.bwf.service;

import com.bwf.bean.bo.AdminAddBo;
import com.bwf.bean.bo.AdminSearchBo;
import com.bwf.bean.po.Admin;

import java.util.List;

/**
 * @author Hua
 */
public interface AdminService {

    Admin loginDo(String username, String password);


    List<Admin> getAdminList(AdminSearchBo bo);

    Admin getAdminByName(String adminName);

    int addAdmin(AdminAddBo bo);

    int updateAdmin(AdminAddBo bo);

    int deleteAdmin(String adminId);

    int addAdminRole(AdminAddBo bo);
}
