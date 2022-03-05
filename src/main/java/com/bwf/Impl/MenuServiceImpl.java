package com.bwf.Impl;

import com.bwf.bean.po.Menu;
import com.bwf.mapper.MenuMapper;
import com.bwf.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hua
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> getMenuListByAdminId(String adminId) {
        return menuMapper.getMenuListByAdminId(adminId);
    }
}
