package com.madg.context;

import com.madg.BeanDefinition;
import com.madg.factory.AbstrctBeanFactory;
import com.madg.factory.AutoWireCapableBeanFactory;
import com.madg.io.UrlResourceLoader;
import com.madg.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * @Author:Madg
 * @Date:2018/11/9/009 21:20
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext
{
    private String configLocation;

    public ClassPathXmlApplicationContext(AbstrctBeanFactory beanFactory, String configLocation) throws Exception
    {
        super(beanFactory);
        this.configLocation = configLocation;
        refresh();
    }

    public ClassPathXmlApplicationContext(String configLocation) throws Exception
    {
        this(new AutoWireCapableBeanFactory(),configLocation);
    }

    public ClassPathXmlApplicationContext(AbstrctBeanFactory beanFactory)
    {
        super(beanFactory);
    }


    @Override
    protected void refresh() throws Exception
    {
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(new UrlResourceLoader());
        reader.loadBeanDefinitions(configLocation);
        for (Map.Entry<String,BeanDefinition> entry:reader.getRegister().entrySet())
        {
            beanFactory.registerBeanDefinition(entry.getKey(),entry.getValue());
        }
    }

    @Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception
    {
        beanFactory.registerBeanDefinition(name,beanDefinition);
    }
}
