package com.madg;

import com.madg.factory.AutoWireCapableBeanFactory;
import com.madg.factory.IBeanFactory;
import com.madg.io.UrlResourceLoader;
import com.madg.xml.XmlBeanDefinitionReader;
import org.junit.Test;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Map;

/**
 * @Author:Madg
 * @Date:2018/11/5/005 21:53
 */
public class BeanFactoryTest
{

    @Test
    public void test() throws Exception
    {
        //1.读取配置
        IBeanDefinitionReader reader=new XmlBeanDefinitionReader(new UrlResourceLoader());
        reader.loadBeanDefinitions("xmlNormal.xml");

        //2.初始化BneaFactory,并注册bean
        IBeanFactory factory=new AutoWireCapableBeanFactory();
        for (Map.Entry<String,BeanDefinition> beanDefinitionEntry:((XmlBeanDefinitionReader) reader).getRegister().entrySet())
        {
            factory.registerBeanDefinition(beanDefinitionEntry.getKey(),beanDefinitionEntry.getValue());
        }

        //3.获得Bean
        HelloWorldService service= (HelloWorldService) factory.getBean("helloWorldService");
        service.helloWorld();
    }
}
