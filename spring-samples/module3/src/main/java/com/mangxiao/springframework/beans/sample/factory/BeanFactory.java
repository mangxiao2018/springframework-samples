package com.mangxiao.springframework.beans.sample.factory;

import com.mangxiao.springframework.beans.sample.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;
}
