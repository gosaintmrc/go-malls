package com.cmos.service.impl;

import java.util.List;

import com.cmos.domain.Product;
import com.cmos.repository.ProductRepository;
import com.cmos.service.IProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 23:13 2018/4/17
 * @Modified By:
 */
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductRepository productRepository;


    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Page<Product> findAll(final int currentPage, final int pageSize) {
        /**
         * 构建分页请求
         */
        PageRequest request=new PageRequest(currentPage,pageSize);
        /**
         * 分页查询
         */
        return productRepository.findAll(request);
    }
}
