package com.cleanwk.ioc;

import com.cleanwk.bean.factory.config.BeanDefinition;
import com.cleanwk.bean.factory.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;

/**
 * @author cleanwk
 * @date 2021/12/7
 */
public class BeanDefinitionTest {

    @Test
    public void testBeanFactory() throws Exception {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.sayHello();
    }
}

