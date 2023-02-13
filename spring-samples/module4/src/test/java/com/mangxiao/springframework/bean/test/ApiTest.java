package com.mangxiao.springframework.bean.test;

import com.mangxiao.springframework.beans.sample.PropertyValue;
import com.mangxiao.springframework.beans.sample.PropertyValues;
import com.mangxiao.springframework.beans.sample.config.BeanDefinition;
import com.mangxiao.springframework.beans.sample.config.BeanReference;
import com.mangxiao.springframework.beans.sample.support.DefaultListableBeanFactory;
import org.junit.Test;

public class ApiTest {

    @Test
    public void testBeanFactory(){
        // 1.初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.UserDao注入
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        // 3.UserService设置属性[uId, userDao]
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        // 4.UserService注入Bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 5.UserService获取bean
        UserService userService = (UserService)beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
