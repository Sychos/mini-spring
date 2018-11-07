package com.madg.io;

import java.net.URL;

/**
 * @Author:Madg
 * @Date:2018/11/7/007 20:54
 */
public class UrlResourceLoader implements IResourceLoader
{
    @Override
    public IResource getResource(String location)
    {
        URL resource=this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }
}


