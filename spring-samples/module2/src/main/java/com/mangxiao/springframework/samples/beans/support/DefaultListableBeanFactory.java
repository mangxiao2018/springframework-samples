package com.mangxiao.springframework.samples.beans.support;

import com.mangxiao.springframework.samples.beans.BeansException;
import com.mangxiao.springframework.samples.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{

   private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    /**
     * 实现自AbstractAutowireCapableBeanFactory->AbstractBeanFactory接口
     * @param beanName
     * @return
     * @throws BeansException
     */
   @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) throw new BeansException("No bean named" + beanName + "is defined");
        return beanDefinition;
    }

    /**
     * 实现自BeanDefinitionRegistry接口
     * @param beanName
     * @param beanDefinition
     */
    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }
}
