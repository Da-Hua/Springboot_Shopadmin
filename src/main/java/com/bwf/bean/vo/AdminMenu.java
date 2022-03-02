package com.bwf.bean.vo;

import com.bwf.bean.po.Menu;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Hua
 */
@Data
@NoArgsConstructor
public class AdminMenu {

    public int adminId;
    public String adminName;
    public String adminPass;
    public String adminNickname;

    public List<Menu> menuList;
}
