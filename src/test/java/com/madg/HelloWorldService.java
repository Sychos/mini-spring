package com.madg;

/**
 * @Author:Madg
 * @Date:2018/11/5/005 21:52
 */
public class HelloWorldService
{
    private String name;
    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public void helloWorld()
    {
        System.out.println(name);
    }
}
