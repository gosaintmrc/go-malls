package com.cmos.test;

import java.util.List;

import com.cmos.domain.Product;
import com.cmos.domain.User;
import com.cmos.service.IProductService;
import com.cmos.service.IUserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 14:36 2018/4/12
 * @Modified By:
 */
public class TestUser extends BaseTest{
    @Autowired
    private IUserService userService;
    @Autowired
    private IProductService productService;
    @Test
    public void test(){
        List<User> all = userService.findAll();
        System.out.println(all);
    }

}
