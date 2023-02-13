package com.mangxiao.springframework.beans.sample.support;

import com.mangxiao.springframework.beans.sample.BeansException;
import com.mangxiao.springframework.beans.sample.core.Resource;
import com.mangxiao.springframework.beans.sample.core.ResourceLoader;

public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
}
