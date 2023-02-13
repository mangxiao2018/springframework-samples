package com.mangxiao.springframework.samples.test.apis;

import com.mangxiao.springframework.samples.beans.factory.config.BeanDefinition;
import com.mangxiao.springframework.samples.beans.support.DefaultListableBeanFactory;
import com.mangxiao.springframework.samples.test.bean.UserService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void testBeanFactory(){
        // 1.初始化 BeanFactory,创建一个存bean的地方
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4.第二次获取bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }
}
