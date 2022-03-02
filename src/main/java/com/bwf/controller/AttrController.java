package com.bwf.controller;

import com.bwf.bean.bo.AttrSearchBo;
import com.bwf.bean.po.Attr;
import com.bwf.service.AttrService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Hua
 */
@Controller
@RequestMapping("/attr")
public class AttrController {

    @Autowired
    private AttrService attrService;

    @RequestMapping("/admin")
    public String admin(AttrSearchBo bo, ModelMap map) {
        PageHelper.startPage(bo.getPageNum() == 0 ? 1 : bo.getPageNum(), bo.getPageSize() == 0 ? 5 : bo.getPageSize());
        final List<Attr> attrList = attrService.getAttrList(bo);
        final PageInfo<Attr> pageInfo = new PageInfo<>(attrList);
        map.addAttribute("pageInfo", pageInfo);
        return "attr/admin";
    }
}
