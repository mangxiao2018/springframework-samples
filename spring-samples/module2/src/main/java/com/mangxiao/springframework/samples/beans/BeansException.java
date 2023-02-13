package com.mangxiao.springframework.samples.beans;

/**
 * 定义Bean的异常类
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg){
        super(msg);
    }

    public BeansException(String msg, Throwable cause){
        super(msg, cause);
    }
}
