package com.mangxiao.springframework.samples.beans.factory.config;

public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
