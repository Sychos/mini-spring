package com.madg.factory;

import com.madg.BeanDefinition;
import com.madg.BeanProperties;

import java.lang.reflect.Field;

/**
 * @Author:Madg
 * @Date:2018/11/6/006 22:19
 */
public class AutoWireCapableBeanFactory extends AbstrctBeanFactory
{
    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) throws Exception
    {
        Object bean=createBeanInstance(beanDefinition);
        applyProperties(bean,beanDefinition);
        return bean;
    }


    protected Object createBeanInstance(BeanDefinition beanDefinition) throws Exception
    {
        return beanDefinition.getBeanClass().newInstance();
    }

    protected void applyProperties(Object bean,BeanDefinition beanDefinition) throws NoSuchFieldException, IllegalAccessException
    {
        for (BeanProperties.Entity entity:beanDefinition.getProperties().getProperties())
        {
            //get all field ,contains:public,protected,private
            Field declaredField=bean.getClass().getDeclaredField(entity.getName());
            declaredField.setAccessible(true);
            declaredField.set(bean,entity.getValue());
        }
    }
}
