package com.bwf.service;

import com.bwf.bean.po.Menu;

import java.util.List;

/**
 * @author Hua
 */
public interface MenuService {

    List<Menu> getMenuListByAdminId(String adminId);

}
