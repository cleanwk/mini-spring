package com.cleanwk.bean.factory.support;

import com.cleanwk.bean.BeansException;
import com.cleanwk.bean.factory.BeanFactory;
import com.cleanwk.bean.factory.config.BeanDefinition;

/**
 * @author cleanwk
 * @date 2021/12/7
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {


    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if(bean != null){
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name,beanDefinition);

    }

    protected abstract BeanDefinition getBeanDefinition(String name);

    protected abstract Object createBean(String name,BeanDefinition beanDefinition);
}
