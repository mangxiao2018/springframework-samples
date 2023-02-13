package com.mangxiao.springframework.samples.test;

import com.mangxiao.springframework.samples.beans.BeanDefinition;
import com.mangxiao.springframework.samples.beans.BeanFactory;

public class ApiTest {

    public void testBeanFacotry(){
        // 1.初始化 BeanFacotry
        BeanFactory beanFactory = new BeanFactory();

        // 2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
