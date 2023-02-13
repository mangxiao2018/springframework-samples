package com.mangxiao.springframework.beans.sample.factory.support;

import com.mangxiao.springframework.beans.sample.BeansException;
import com.mangxiao.springframework.beans.sample.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) throws BeansException;

}
