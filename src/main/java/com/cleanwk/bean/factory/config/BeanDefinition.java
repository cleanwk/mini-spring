package com.cleanwk.bean.factory.config;

/**
 *BeanDefinition保存bean的元数信息,用作bean实例化
 *
 * @author cleanwk
 * @date 2021/12/7
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
