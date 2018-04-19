package com.cmos.core.controller;

import java.util.Collection;
import java.util.Map;

import com.cmos.domain.Product;
import com.cmos.service.IProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Authgor: gosaint
 * @Description:商品控制层(后台管理系统)
 * @Date Created in 21:32 2018/4/18
 * @Modified By:
 */
@Controller
public class ProductController {
    @Autowired
    private IProductService productService;

    /**
     * 首页展示
     * @return
     */
    @RequestMapping("/")
    public String showIndex(){
        return "index2";
    }

    /**
     * 商品列表的展示
     * @param currntPage
     * @param pageSize
     * @return
     */
    @GetMapping("/data/product/list")
    @ResponseBody
    public Page<Product> Index(Integer currntPage,Integer pageSize){
        //分页查询商品列表
        return productService.findAll(currntPage, pageSize);
    }
}
