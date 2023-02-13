package com.mangxiao.springframework.beans.sample.core;

import cn.hutool.core.lang.Assert;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class UrlResouce implements Resource{

    private final URL url;

    public UrlResouce(URL url){
        Assert.notNull(url, "URL must not be null");
        this.url = url;
    }
    @Override
    public InputStream getInputStream() throws IOException {
        URLConnection con = this.url.openConnection();
        try {
            return con.getInputStream();
        } catch (IOException ex){
            if (con instanceof HttpURLConnection){
                ((HttpURLConnection)con).disconnect();
            }
            throw ex;
        }

    }
}
