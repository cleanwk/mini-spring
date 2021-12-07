package com.cleanwk.bean.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author cleanwk
 * @date 2021/12/7
 */
class BeanFactoryTest {

    @Test
    void registerBean() {

    }

    @Test
    void getBean() {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("helloService", new HelloService());
        HelloService  helloService = (HelloService)beanFactory.getBean("helloService");
        assertNotNull(helloService);
        assertEquals("hello",helloService.sayHello());

    }

    class HelloService {
        public String sayHello() {
            System.out.println("hello");
            return "hello";
        }
    }
}