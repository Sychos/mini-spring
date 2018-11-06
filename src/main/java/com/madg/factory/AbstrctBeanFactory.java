package com.madg.factory;

import com.madg.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author:Madg
 * @Date:2018/11/6/006 22:07
 */
public abstract class AbstrctBeanFactory implements IBeanFactory
{
    private Map<String, BeanDefinition> map=new ConcurrentHashMap<>();

    protected abstract Object doCreateBean(BeanDefinition beanDefinition);

    @Override
    public Object getBean(String name)
    {
        return map.get(name).getBean();
    }

    @Override
    public void registerBeanDefinition(String name,BeanDefinition beanDefinition)
    {
        Object object=doCreateBean(beanDefinition);
        beanDefinition.setBean(object);
        map.put(name,beanDefinition);
    }
}
