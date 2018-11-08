package com.madg;

/**
 * @Author:Madg
 * @Date:2018/11/5/005 21:52
 */
public class HelloWorldService
{
    private String name;
    private OutputService outputService;

    public void setOutputService(OutputService outputService)
    {
        this.outputService = outputService;
    }

    public void setName(String name)
    {
        this.name=name;
    }


    public void helloWorld()
    {
        outputService.output(name);
    }
}
