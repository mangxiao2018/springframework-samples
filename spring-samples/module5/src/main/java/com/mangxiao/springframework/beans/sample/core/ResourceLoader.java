package com.mangxiao.springframework.beans.sample.core;

public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath";
    Resource getResource(String location);
}
