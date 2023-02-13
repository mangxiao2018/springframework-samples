package com.mangxiao.springframework.beans.sample.support;

import com.mangxiao.springframework.beans.sample.BeansException;
import com.mangxiao.springframework.beans.sample.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) throws BeansException;

}
