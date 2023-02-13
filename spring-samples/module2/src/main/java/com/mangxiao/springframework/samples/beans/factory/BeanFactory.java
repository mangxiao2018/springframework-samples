package com.mangxiao.springframework.samples.beans.factory;

import com.mangxiao.springframework.samples.beans.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
