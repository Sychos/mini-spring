package com.madg.factory;

import com.madg.BeanDefinition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author:Madg
 * @Date:2018/11/6/006 22:07
 */
public abstract class AbstrctBeanFactory implements IBeanFactory
{
    private Map<String, BeanDefinition> map=new ConcurrentHashMap<>();
    private final List<String> beanDefinitionNames=new ArrayList<>();

    protected abstract Object doCreateBean(BeanDefinition beanDefinition) throws Exception;

    @Override
    public Object getBean(String name) throws Exception
    {
        BeanDefinition beanDefinition=map.get(name);
        if (beanDefinition==null)
        {
            throw new IllegalArgumentException("No bean named"+name+"is defined");
        }

        Object bean=beanDefinition.getBean();
        if (bean==null)
        {
            bean=doCreateBean(beanDefinition);
        }

        return bean;
    }

    public void preInstantiateSingletons() throws Exception {
        for (Iterator it = this.beanDefinitionNames.iterator(); it.hasNext();) {
            String beanName = (String) it.next();
            getBean(beanName);
        }
    }


    @Override
    public void registerBeanDefinition(String name,BeanDefinition beanDefinition) throws Exception
    {
        map.put(name,beanDefinition);
        beanDefinitionNames.add(name);
    }
}
