package com.mangxiao.springframework.samples.beans.support;

import com.mangxiao.springframework.samples.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    /**
     * 存储bean到HashMap中供二次调用
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
