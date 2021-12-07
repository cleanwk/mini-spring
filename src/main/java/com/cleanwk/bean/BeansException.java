package com.cleanwk.bean;

/**
 * @author cleanwk
 * @date 2021/12/7
 */
public class BeansException extends RuntimeException{

    public BeansException(String msg){
        super(msg);
    }

    public BeansException(String msg,Throwable cause){
        super(msg,cause);
    }

}
