package com.cleanwk.bean.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cleanwk
 * @date 2021/12/7
 */
public class BeanFactory {

    private Map<String,Object> beanMap = new HashMap<>();

    public void registerBean(String name,Object bean){
        beanMap.put(name,bean);
    }

    public Object getBean(String name){
        return beanMap.get(name);
    }
}
