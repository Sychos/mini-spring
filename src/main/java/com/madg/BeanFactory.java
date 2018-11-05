package com.madg;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author:Madg
 * @Date:2018/11/5/005 21:41
 */
public class BeanFactory
{
    private Map<String,BeanDefinition> map=new ConcurrentHashMap<>();

    public Object getBean(String beanName)
    {
        return map.get(beanName).getBean();
    }

    public void registerBeanDefinition(String beanName,BeanDefinition beanDefinition)
    {
        map.put(beanName,beanDefinition);
    }
}
