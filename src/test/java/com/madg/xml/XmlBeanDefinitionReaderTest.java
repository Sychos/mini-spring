package com.madg.xml;

import com.madg.BeanDefinition;
import com.madg.IBeanDefinitionReader;
import com.madg.io.IResourceLoader;
import com.madg.io.UrlResource;
import com.madg.io.UrlResourceLoader;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * @Author:Madg
 * @Date:2018/11/7/007 21:57
 */
public class XmlBeanDefinitionReaderTest
{

    @Test
    public void loadBeanDefinitions() throws Exception
    {
        IBeanDefinitionReader reader=new XmlBeanDefinitionReader(new UrlResourceLoader());
        reader.loadBeanDefinitions("xmlResource.xml");
        Map<String, BeanDefinition> registry=((XmlBeanDefinitionReader) reader).getRegister();

        Assert.assertTrue(registry.size()>0);
    }
}