package com.bwf.controller;

import com.bwf.bean.bo.OrderSearchBo;
import com.bwf.bean.po.Order;
import com.bwf.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author Hua
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping("/admin")
    public String admin(OrderSearchBo bo, ModelMap map) {
        PageHelper.startPage(bo.getPageNum() == 0 ? 1 : bo.getPageNum(), bo.getPageSize() == 0 ? 5 : bo.getPageSize());
        final List<Order> orderList = orderService.getOrderList(bo);
        final PageInfo<Order> pageInfo = new PageInfo<>(orderList);
        map.addAttribute("pageInfo", pageInfo);
        return "order/admin";
    }

    @RequestMapping("/save")
    public String save(OrderSearchBo bo, Model model){
        model.addAttribute("back","/order/admin");
        if (orderService.saveOrder(bo) == 1) {
            return "common/success";
        } else {
            return "common/error";
        }
    }

}

