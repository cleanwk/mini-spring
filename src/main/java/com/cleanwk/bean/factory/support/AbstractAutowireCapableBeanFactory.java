package com.cleanwk.bean.factory.support;

import com.cleanwk.bean.BeansException;
import com.cleanwk.bean.factory.BeanFactory;
import com.cleanwk.bean.factory.config.BeanDefinition;

/**
 * @author cleanwk
 * @date 2021/12/7
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object createBean(String name,BeanDefinition beanDefinition) {
        return doCreateBean(name,beanDefinition);
    }

    private Object doCreateBean(String name,BeanDefinition beanDefinition){
        Class beanClass = beanDefinition.getBeanClass();
        Object bean = null;
        try {
            bean = beanClass.newInstance();
        } catch (Exception e) {
            throw new BeansException("Instantiation of bean failed",e);
        }
        addSingleton(name,bean);
        return bean;
    }
}
