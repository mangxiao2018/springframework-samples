package com.mangxiao.springframework.beans.sample.factory.support;

import com.mangxiao.springframework.beans.sample.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
