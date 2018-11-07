package com.madg.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Author:Madg
 * @Date:2018/11/7/007 20:56
 */
public class UrlResource implements IResource
{
    private final URL url;

    public UrlResource(URL url)
    {
        this.url = url;
    }

    @Override
    public InputStream getInputStream() throws IOException
    {
        URLConnection urlConnection=url.openConnection();
        urlConnection.connect();

        return urlConnection.getInputStream();
    }
}
