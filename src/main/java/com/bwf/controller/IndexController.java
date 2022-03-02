package com.bwf.controller;

import com.alibaba.fastjson.JSONObject;
import com.bwf.bean.po.Admin;
import com.bwf.bean.po.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Hua
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(@ModelAttribute("admin") String admin, @ModelAttribute("menuList") String menuList, ModelMap map) {
        map.addAttribute("admin", JSONObject.parseObject(admin, Admin.class));
        map.addAttribute("menuList", JSONObject.parseArray(menuList, Menu.class));
        return "index";
    }
}
