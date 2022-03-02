package com.bwf.controller;

import com.alibaba.fastjson.JSONObject;
import com.bwf.bean.bo.AdminAddBo;
import com.bwf.bean.bo.AdminSearchBo;
import com.bwf.bean.po.Admin;
import com.bwf.service.AdminService;
import com.bwf.service.MenuService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


/**
 * @author Hua
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/loginDo")
    public String loginDo(String username, String password, RedirectAttributes attributes) {
        Admin admin = adminService.loginDo(username, password);
        if (admin != null) {
            attributes.addFlashAttribute("admin", JSONObject.toJSONString(admin));
            attributes.addFlashAttribute("menuList", JSONObject.toJSONString(menuService.getMenuListByAdminId(admin.getAdminId())));
            return "redirect:/index";
        } else {
            return "redirect:/admin/login";
        }
    }

    @RequestMapping("/logout")
    public String logout() {
        return "redirect:/admin/login";
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping("/admin")
    public String admin(AdminSearchBo bo, ModelMap map) {
        PageHelper.startPage(bo.getPageNum() == 0 ? 1 : bo.getPageNum(), bo.getPageSize() == 0 ? 5 : bo.getPageSize());
        final List<Admin> adminList = adminService.getAdminList(bo);
        final PageInfo<Admin> pageInfo = new PageInfo<>(adminList);
        map.addAttribute("pageInfo", pageInfo);
        return "admin/admin";
    }

    @RequestMapping("/add")
    public String add() {
        return "/admin/add";
    }

    @RequestMapping("/validAdminName")
    @ResponseBody
    public String validAdminName(String adminName) {
        final Admin admin = adminService.getAdminByName(adminName);
        return admin == null ? "1" : "0";
    }

    @RequestMapping("/save")
    public String save(AdminAddBo bo, Model model) {
        model.addAttribute("back","/admin/admin");
        if (adminService.addAdmin(bo) == 1) {
            return "common/success";
        } else {
            return "common/error";
        }
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(AdminSearchBo bo, ModelMap map) {
        map.addAttribute("adminToUpdate", bo);
        return "/admin/update";
    }

    @RequestMapping("/update")
    public String update(AdminAddBo bo, Model model) {
        model.addAttribute("back","/admin/admin");
        if (adminService.updateAdmin(bo) == 1) {
            return "common/success";
        } else {
            return "common/error";
        }
    }

    @RequestMapping("/delete/{adminId}")
    public String delete(@PathVariable String adminId, Model model) {
        model.addAttribute("back","/admin/admin");
        if (adminService.deleteAdmin(adminId) == 1) {
            return "common/success";
        } else {
            return "common/error";
        }
    }

}
