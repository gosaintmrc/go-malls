package com.cmos.service;

import java.util.List;

import com.cmos.domain.Product;

import org.springframework.data.domain.Page;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 23:12 2018/4/17
 * @Modified By:
 */
public interface IProductService {
    /**
     * 查询所有的商品
     * @return
     */
    List<Product>  getAll();

    /**
     * 分页查询
     * @param currentPage
     * @param pageSize
     * @return
     * Page对象为Spring Data JPA的内置分页对象
     */
    Page<Product> findAll(int currentPage, int pageSize);
}
