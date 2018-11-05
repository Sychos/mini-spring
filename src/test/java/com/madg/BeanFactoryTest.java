package com.madg;

import org.junit.Test;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @Author:Madg
 * @Date:2018/11/5/005 21:53
 */
public class BeanFactoryTest
{
    @Test
    public void test()
    {
        //1.初始化factory
        BeanFactory factory=new BeanFactory();

        //2.注入beanDefinition
        BeanDefinition beanDefinition=new BeanDefinition(new HelloWorldService());
        factory.registerBeanDefinition("beanHelloWorld",beanDefinition);

        //3.获取
        HelloWorldService service= (HelloWorldService) factory.getBean("beanHelloWorld");
        service.helloWorld();
    }
}
