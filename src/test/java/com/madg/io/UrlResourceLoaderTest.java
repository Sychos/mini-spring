package com.madg.io;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * @Author:Madg
 * @Date:2018/11/7/007 20:59
 */
public class UrlResourceLoaderTest
{

    @Test
    public void getResource() throws IOException
    {
        IResourceLoader resourceLoader=new UrlResourceLoader();

        IResource resource= resourceLoader.getResource("xmlResource.xml");

        InputStream inputStream=resource.getInputStream();

        Assert.assertNotNull(inputStream);
    }
}