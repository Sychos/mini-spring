package com.madg.factory;

import com.madg.BeanDefinition;
import com.madg.BeanProperties;
import com.madg.BeanReference;

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
        beanDefinition.setBean(bean);
        applyProperties(bean,beanDefinition);
        return bean;
    }


    protected Object createBeanInstance(BeanDefinition beanDefinition) throws Exception
    {
        return beanDefinition.getBeanClass().newInstance();
    }

    protected void applyProperties(Object bean,BeanDefinition beanDefinition) throws Exception
    {
        for (BeanProperties.Entity entity:beanDefinition.getProperties().getProperties())
        {
            //get all field ,contains:public,protected,private
            Field declaredField=bean.getClass().getDeclaredField(entity.getName());
            declaredField.setAccessible(true);
            Object value=entity.getValue();
            if (value instanceof BeanReference)
            {
                BeanReference beanReference= (BeanReference) value;
                value=getBean(beanReference.getName());
            }
            declaredField.set(bean,entity.getValue());
        }
    }
}
