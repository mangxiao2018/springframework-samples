package com.mangxiao.springframework.beans.sample.support;


import com.mangxiao.springframework.beans.sample.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
