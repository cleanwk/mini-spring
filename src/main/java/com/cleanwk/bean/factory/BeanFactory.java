package com.cleanwk.bean.factory;

import com.cleanwk.bean.BeansException;

/**
 * @author cleanwk
 * @date 2021/12/7
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
