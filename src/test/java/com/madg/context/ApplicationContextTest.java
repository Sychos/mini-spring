package com.madg.context;

import com.madg.HelloWorldService;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author:Madg
 * @Date:2018/11/9/009 22:29
 */
public class ApplicationContextTest
{
    @Test
    public void test() throws Exception
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("xmlResource.xml");
        HelloWorldService service= (HelloWorldService) context.getBean("helloWorldService");
        service.helloWorld();
    }

}