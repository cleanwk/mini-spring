package com.cleanwk.bean.factory.support;

import com.cleanwk.bean.factory.config.SingletonBeanRegistry;

import javax.jws.Oneway;
import java.util.HashMap;
import java.util.Map;

/**
 * @author cleanwk
 * @date 2021/12/7
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String name) {
        return singletonObjects.get(name);
    }

    protected void addSingleton(String name,Object singletonObject){
        singletonObjects.put(name,singletonObject);
    }
}
