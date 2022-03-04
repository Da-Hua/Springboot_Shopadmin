package com.bwf.service;

import com.bwf.bean.bo.AdminAddBo;
import com.bwf.bean.bo.AdminSearchBo;
import com.bwf.bean.po.Admin;
import com.bwf.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hua
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin loginDo(String username, String password) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        final Admin admin = adminMapper.loginDo(username);
        if (passwordEncoder.matches(password, admin.getAdminPass())) {
            return admin;
        }
        return null;
    }

    @Override
    public List<Admin> getAdminList(AdminSearchBo bo) {
        return adminMapper.getAdminList(bo);
    }

    @Override
    public Admin getAdminByName(String adminName) {
        return adminMapper.getAdminByName(adminName);
    }

    @Override
    public int addAdmin(AdminAddBo bo) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        bo.setAdminPass(passwordEncoder.encode("123456"));
        return adminMapper.addAdmin(bo);
    }

    @Override
    public int updateAdmin(AdminAddBo bo) {
        int returnValue = 0;
        if (bo.getRoleId() != -1 && !"".equals(bo.getAdminPass())){
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            bo.setAdminPass(passwordEncoder.encode(bo.getAdminPass()));
            returnValue = adminMapper.updateAdmin(bo);
        }
        return returnValue;
    }

    @Override
    public int deleteAdmin(String adminId) {
        return adminMapper.deleteAdmin(adminId);
    }

    @Override
    public int addAdminRole(AdminAddBo bo) {
        return adminMapper.addAdminRole(bo);
    }
}
