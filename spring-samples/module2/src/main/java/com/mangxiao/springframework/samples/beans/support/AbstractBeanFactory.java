package com.mangxiao.springframework.samples.beans.support;

import com.mangxiao.springframework.samples.beans.BeansException;
import com.mangxiao.springframework.samples.beans.factory.BeanFactory;
import com.mangxiao.springframework.samples.beans.factory.config.BeanDefinition;

/**
 * 通过模板设计模式来实现获取bean和创建bean
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    /**
     * 实现自BeanFactory接口
     * @param name
     * @return
     * @throws BeansException
     */
    @Override
    public Object getBean(String name) throws BeansException {
        //调用父类DefaultSingletonBeanRegistry中的getSingleton方法
        Object bean = getSingleton(name);
        if (bean != null){
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
