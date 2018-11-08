package com.madg.factory;

import com.madg.BeanDefinition;

/**
 * @Author:Madg
 * @Date:2018/11/6/006 22:06
 */
public interface IBeanFactory
{
    Object getBean(String name) throws Exception;
    void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception;
}
