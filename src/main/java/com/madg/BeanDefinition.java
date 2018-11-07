package com.madg;

/**
 * @Author:Madg
 * @Date:2018/11/5/005 21:40
 */
public class BeanDefinition
{
    private Object bean;
    private Class beanClass;
    private String beanClassName;
    private BeanProperties properties;

    public BeanDefinition()
    {
        properties=new BeanProperties();
    }

    public Class getBeanClass()
    {
        return beanClass;
    }

    public void setBeanClass(Class beanClass)
    {
        this.beanClass = beanClass;
    }

    public String getBeanClassName()
    {
        return beanClassName;
    }

    public void setBeanClassName(String beanClassName)
    {
        this.beanClassName = beanClassName;
        try
        {
            this.beanClass=Class.forName(beanClassName);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void setBean(Object bean)
    {
        this.bean = bean;
    }

    public Object getBean()
    {
        return this.bean;
    }

    public BeanProperties getProperties()
    {
        return properties;
    }

    public void setProperties(BeanProperties properties)
    {
        this.properties = properties;
    }
}
