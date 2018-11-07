package com.madg;

import java.io.IOException;

/**
 * @Author:Madg
 * @Date:2018/11/7/007 21:30
 * 从配置中读取BeanDefinitionReader
 */
public interface IBeanDefinitionReader
{
    void loadBeanDefinitions(String location) throws Exception;
}
