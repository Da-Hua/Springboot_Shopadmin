package com.bwf.controller;

import com.bwf.bean.bo.BrandAddBo;
import com.bwf.bean.bo.BrandSearchBo;
import com.bwf.bean.po.Brand;
import com.bwf.service.BrandService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Hua
 */
@Controller
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @RequestMapping("/admin")
    public String admin(BrandSearchBo bo, ModelMap map) {
        PageHelper.startPage(bo.getPageNum() == 0 ? 1 : bo.getPageNum(), bo.getPageSize() == 0 ? 5 : bo.getPageSize());
        final List<Brand> brandList = brandService.getBrandList(bo);
        final PageInfo<Brand> pageInfo = new PageInfo<>(brandList);
        map.addAttribute("pageInfo", pageInfo);
        return "brand/admin";
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(BrandSearchBo bo, ModelMap map) {
        map.addAttribute("brandToUpdate", bo);
        return "brand/update";
    }

    @RequestMapping("/update")
    public String update(BrandSearchBo bo,  Model model) {
        model.addAttribute("back","/brand/admin");
        if (brandService.updateBrand(bo) == 1) {
            return "common/success";
        } else {
            return "common/error";
        }
    }

    @RequestMapping("/add")
    public String add(){
        return "brand/add";
    }

    @RequestMapping("/save")
    public String save(BrandAddBo bo, Model model) {
        model.addAttribute("back","/brand/admin");
        if (brandService.addBrand(bo) == 1) {
            return "common/success";
        } else {
            return "common/error";
        }
    }

    @RequestMapping("/delete/{brandId}")
    public String delete(@PathVariable String brandId, Model model) {
        model.addAttribute("back","/brand/admin");
        if (brandService.deleteBrand(brandId) == 1) {
            return "common/success";
        } else {
            return "common/error";
        }
    }
}
