package com.cleanwk.bean.factory.support;

import com.cleanwk.bean.factory.config.BeanDefinition;

/**
 *BeanDefinition注册表接口
 *
 * @author cleanwk
 * @date 2021/12/7
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册beanDefinition
     * @param name
     * @param beanDefinition
     */
    void registerBeanDefinition(String name, BeanDefinition beanDefinition);
}
