package com.mangxiao.springframework.beans.sample.factory.config;

public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
