package com.madg;

/**
 * @Author:Madg
 * @Date:2018/11/5/005 21:40
 */
public class BeanDefinition
{
    private Object bean;

    public BeanDefinition(Object bean)
    {
        this.bean = bean;
    }

    public Object getBean()
    {
        return this.bean;
    }
}
