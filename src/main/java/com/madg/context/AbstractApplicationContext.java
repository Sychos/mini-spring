package com.madg.context;

import com.madg.factory.AbstrctBeanFactory;

/**
 * @Author:Madg
 * @Date:2018/11/9/009 21:11
 */
public abstract class AbstractApplicationContext implements ApplicationContext
{
    protected AbstrctBeanFactory beanFactory;

    public AbstractApplicationContext(AbstrctBeanFactory beanFactory)
    {
        this.beanFactory = beanFactory;
    }

    protected abstract void refresh() throws Exception;

    @Override
    public Object getBean(String name) throws Exception
    {
        return beanFactory.getBean(name);
    }
}
