package com.cmos.repository;

import com.cmos.domain.Product;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 23:14 2018/4/17
 * @Modified By:
 */
public interface ProductRepository extends JpaRepository<Product,Long> {
}
