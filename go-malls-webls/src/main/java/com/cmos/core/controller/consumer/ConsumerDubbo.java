package com.cmos.core.controller.consumer;

import java.util.List;

import com.cmos.domain.User;
import com.cmos.service.IUserService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerDubbo {
	public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"META-INF/spring/spring-dispatherServlet-*.xml"});
        context.start();
        System.in.read();
        IUserService testService = (IUserService) context.getBean("userService");
            List<User> all = testService.findAll();
        System.out.println("********************************8");
            System.out.println(all);
    }

}