package com.bwf.service;

import com.bwf.bean.bo.AdminAddBo;
import com.bwf.bean.bo.AdminSearchBo;
import com.bwf.bean.po.Admin;

import java.util.List;

/**
 * @author Hua
 */
public interface AdminService {

    public Admin loginDo(String username, String password);


    public List<Admin> getAdminList(AdminSearchBo bo);

    public Admin getAdminByName(String adminName);

    public int addAdmin(AdminAddBo bo);

    public int updateAdmin(AdminAddBo bo);

    public int deleteAdmin(String adminId);
}
