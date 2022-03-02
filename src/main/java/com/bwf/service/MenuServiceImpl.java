package com.bwf.service;

import com.bwf.bean.po.Menu;
import com.bwf.mapper.MenuMapper;
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
    public List<Menu> getMenuListByAdminId(int adminId) {
        return menuMapper.getMenuListByAdminId(adminId);
    }
}
