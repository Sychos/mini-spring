package com.madg.factory;

import com.madg.BeanDefinition;

/**
 * @Author:Madg
 * @Date:2018/11/6/006 22:19
 */
public class AutoWireCapableBeanFactory extends AbstrctBeanFactory
{
    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition)
    {
        try
        {
            Object bean=beanDefinition.getBeanClass().newInstance();
            return bean;
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
