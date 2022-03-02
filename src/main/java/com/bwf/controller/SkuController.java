package com.bwf.controller;

import com.bwf.bean.bo.SkuAddBo;
import com.bwf.bean.bo.SkuSearchBo;
import com.bwf.bean.bo.SpuSearchBo;
import com.bwf.bean.po.Sku;
import com.bwf.bean.po.Spu;
import com.bwf.service.SkuService;
import com.bwf.service.SpuService;
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
@RequestMapping("/sku")
public class SkuController {

    @Autowired
    private SkuService skuService;

    @Autowired
    private SpuService spuService;

    @RequestMapping("/admin")
    public String admin(SkuSearchBo skuBo, SpuSearchBo spuBo, ModelMap map) {
        PageHelper.startPage(skuBo.getPageNum() == 0 ? 1 : skuBo.getPageNum(), skuBo.getPageSize() == 0 ? 5 : skuBo.getPageSize());
        final List<Sku> skuList = skuService.getSkuList(skuBo);
        final List<Spu> spuList = spuService.getSpuList(spuBo);
        final PageInfo<Sku> pageInfo = new PageInfo<>(skuList);
        map.addAttribute("pageInfo", pageInfo);
        map.addAttribute("spuList", spuList);
        return "sku/admin";
    }

    @RequestMapping("/toUpdate/{skuId}")
    public String toUpdate(@PathVariable Long skuId, ModelMap map) {
        map.addAttribute("spu", spuService.getSpuBySkuId(skuId));
        return "common/success";
    }

    @RequestMapping("/add")
    public String add(SpuSearchBo bo, ModelMap map) {
        map.addAttribute("spuList", spuService.getSpuList(bo));
        return "/sku/add";
    }

    @RequestMapping("/save")
    public String save(SkuAddBo bo, Model model) {
        model.addAttribute("back","/sku/admin");
        if (skuService.addSku(bo) == 1) {
            return "common/success";
        } else {
            return "common/error";
        }
    }
}
