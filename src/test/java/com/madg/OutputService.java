package com.madg;

import org.junit.Assert;

/**
 * @Author:Madg
 * @Date:2018/11/8 16:35
 */
public class OutputService
{
    HelloWorldService helloWorldService;

    public void setHelloWorldService(HelloWorldService helloWorldService)
    {
        this.helloWorldService = helloWorldService;
    }

    public void output(String text)
    {
        Assert.assertNotNull(helloWorldService);
        System.out.println(text);
    }
}
