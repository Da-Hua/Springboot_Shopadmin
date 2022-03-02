package com.bwf.controller;

import com.bwf.bean.bo.AttrSearchBo;
import com.bwf.bean.bo.BrandSearchBo;
import com.bwf.bean.bo.CategoryAddBo;
import com.bwf.bean.po.Attr;
import com.bwf.bean.po.Brand;
import com.bwf.bean.po.Category;
import com.bwf.service.AttrService;
import com.bwf.service.BrandService;
import com.bwf.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private BrandService brandService;

    @Autowired
    private AttrService attrService;

    @RequestMapping("/admin")
    public String admin(BrandSearchBo bo, Model model) {
        model.addAttribute("categoryList",categoryService.getCategoryListByParentId(null));
        return "category/admin";
    }

    @RequestMapping("/getCategoryListByParentId/{parentId}")
    @ResponseBody
    public List<Category> getCategoryListByParentId(@PathVariable("parentId") Integer parentId){
        return categoryService.getCategoryListByParentId(parentId);
    }

    @RequestMapping("/add")
    public String add(BrandSearchBo bsBo, AttrSearchBo asBo, Integer pid, ModelMap map) {
        List<Brand> brandList = brandService.getBrandList(bsBo);
        List<Attr> attrList = attrService.getAttrList(null);
        map.addAttribute("brandList", brandList);
        map.addAttribute("attrList", attrList);
        map.addAttribute("pid", pid);
        return "category/add";
    }

    @RequestMapping("/save")
    public String save(CategoryAddBo bo, ModelMap map) {
        map.addAttribute("back", "/category/admin");
        if (categoryService.addCategory(bo) == 1) {
            return "common/success";
        } else {
            return "common/error";
        }
    }
}
