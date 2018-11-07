package com.madg.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author:Madg
 * @Date:2018/11/7/007 20:51
 */
public interface IResource
{
    InputStream getInputStream() throws IOException;
}
