package com.cmos.service.publish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Authgor: gosaint
 * @Description:
 * @Date Created in 15:03 2018/4/12
 * @Modified By:
 * 启动spring容器
 */
public class DubboPublish {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("classpath:spring-*.xml");
        System.out.println("服务开启！");
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
