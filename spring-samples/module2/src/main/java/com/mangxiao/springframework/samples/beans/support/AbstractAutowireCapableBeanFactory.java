package com.mangxiao.springframework.samples.beans.support;

import com.mangxiao.springframework.samples.beans.BeansException;
import com.mangxiao.springframework.samples.beans.factory.config.BeanDefinition;

import java.lang.reflect.InvocationTargetException;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{
    /**
     * 创建bean
     * @param beanName
     * @param beanDefinition
     * @return
     * @throws BeansException
     */
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException e){
            throw new BeansException("Instantiation of bean failed", e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        addSingleton(beanName, bean);
        return bean;
    }
}
