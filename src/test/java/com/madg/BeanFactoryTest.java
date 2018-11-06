package com.madg;

import com.madg.factory.AutoWireCapableBeanFactory;
import com.madg.factory.IBeanFactory;
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
        IBeanFactory factory=new AutoWireCapableBeanFactory();

        //2.注入beanDefinition
        BeanDefinition beanDefinition=new BeanDefinition();
        beanDefinition.setBeanClassName("com.madg.HelloWorldService");
        factory.registerBeanDefinition("beanHelloWorld",beanDefinition);

        //3.获取
        HelloWorldService service= (HelloWorldService) factory.getBean("beanHelloWorld");
        service.helloWorld();
    }
}
