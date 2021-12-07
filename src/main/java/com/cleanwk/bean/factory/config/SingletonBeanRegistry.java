package com.cleanwk.bean.factory.config;

/**
 * 单例bean的注册表
 *
 * @author cleanwk
 * @date 2021/12/7
 */
public interface SingletonBeanRegistry {
    /**
     * 获取单例bean
     * @param name
     * @return
     */
    Object getSingleton(String name);
}
