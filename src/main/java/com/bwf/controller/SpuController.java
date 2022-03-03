package com.bwf.controller;

import com.bwf.bean.bo.BrandSearchBo;
import com.bwf.bean.bo.CategorySearchBo;
import com.bwf.bean.bo.SpuAddBo;
import com.bwf.bean.bo.SpuSearchBo;
import com.bwf.bean.po.Brand;
import com.bwf.bean.po.Category;
import com.bwf.bean.po.Spu;
import com.bwf.service.BrandService;
import com.bwf.service.CategoryService;
import com.bwf.service.SpuService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Hua
 */
@Controller
@RequestMapping("/spu")
public class SpuController {

    @Autowired
    private SpuService spuService;

    @Autowired
    private BrandService brandService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/admin")
    public String admin(SpuSearchBo ssBo, BrandSearchBo bsBo, CategorySearchBo csBo, ModelMap map) {
        PageHelper.startPage(ssBo.getPageNum() == 0 ? 1 : ssBo.getPageNum(), ssBo.getPageSize() == 0 ? 5 : ssBo.getPageSize());
        final List<Spu> spuList = spuService.getSpuList(ssBo);
        for (Spu spu : spuList) {
            spu.setCategoryList(categoryService.getCategoryListBySpuId(spu.getSpuId()));
        }
        final List<Brand> brandList = brandService.getBrandList(bsBo);
        final List<Category> cateList = categoryService.getCategoryList(csBo);
        final PageInfo<Spu> pageInfo = new PageInfo<>(spuList);
        map.addAttribute("brandList", brandList);
        map.addAttribute("cateList", cateList);
        map.addAttribute("pageInfo", pageInfo);
        return "spu/admin";
    }

    @RequestMapping("/add")
    public String add(BrandSearchBo bsBo,CategorySearchBo csBo, ModelMap map) {
        map.addAttribute("brandList", brandService.getBrandList(bsBo));
        map.addAttribute("cateList", categoryService.getCategoryList(csBo));
        return "spu/add";
    }

    @RequestMapping("/save")
    public String save(SpuAddBo bo, Model model) {
        model.addAttribute("back","/spu/admin");
//        if (spuService.addSpu(bo) == 1) {
            return "common/success";
//        } else {
//            return "common/error";
//        }
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(SpuSearchBo bo, ModelMap map) {
        map.addAttribute("SpuToUpdate", bo);
        return "spu/update";
    }

    @RequestMapping("/update")
    public String update(SpuSearchBo bo,  Model model) {
        model.addAttribute("back","/spu/admin");
//        if (spuService.updateSpu(bo) == 1) {
            return "common/success";
//        } else {
//            return "common/error";
//        }
    }
}
