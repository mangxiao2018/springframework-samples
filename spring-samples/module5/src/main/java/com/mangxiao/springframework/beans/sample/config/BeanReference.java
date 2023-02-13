package com.mangxiao.springframework.beans.sample.config;

public class BeanReference {
    private final String beanName;

    public BeanReference(String beanName){
        this.beanName = beanName;
    }
    public String getBeanName() {
        return beanName;
    }
}
