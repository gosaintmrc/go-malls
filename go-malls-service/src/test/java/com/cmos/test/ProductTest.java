package com.cmos.test;

import java.util.List;

import com.cmos.domain.Product;
import com.cmos.service.IProductService;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 12:48 2018/4/18
 * @Modified By:
 */
public class ProductTest extends BaseTest{
    @Autowired
    private IProductService productService;

    /**
     * 查询所有商品列表测试
     */
    @Test
    public void testShowListProduct(){
        List<Product> all = productService.getAll();
        System.out.println("00000000000000000000");
        System.out.println(all);
    }

    /**
     * 分页测试
     */
    @Test
    public void testPage(){
        Page<Product> all = productService.findAll(1, 10);
        System.out.println("============");
        int totalPages = all.getTotalPages();
        System.out.println(all);
        System.out.println("总页数"+totalPages);
        System.out.println("当前页"+all.getNumber());
        System.out.println(all.getSize());
    }
}
