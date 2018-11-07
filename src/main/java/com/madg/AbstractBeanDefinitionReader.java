package com.madg;

import com.madg.io.IResourceLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:Madg
 * @Date:2018/11/7/007 21:31
 * 从配置中读取BeanDefinitionReader
 */
public abstract class AbstractBeanDefinitionReader implements IBeanDefinitionReader
{
    private Map<String,BeanDefinition> register;
    private IResourceLoader resourceLoader;

    public AbstractBeanDefinitionReader(IResourceLoader resourceLoader)
    {
        this.register=new HashMap<String, BeanDefinition>();
        this.resourceLoader = resourceLoader;
    }

    public Map<String, BeanDefinition> getRegister()
    {
        return register;
    }

    public IResourceLoader getResourceLoader()
    {
        return resourceLoader;
    }
}
