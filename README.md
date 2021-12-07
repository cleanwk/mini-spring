## 待实现功能

### 基础篇

#### IoC

- [x] 实现一个简单的容器
- [ ] BeanDefinition和BeanDefinitionRegistry
- [ ] Bean实例化策略InstantiationStrategy
- [ ] 为bean填充属性
- [ ] 为bean注入bean
- [ ] 资源和资源加载器
- [ ] 在xml文件中定义bean
- [ ] 容器扩展机制BeanFactoryPostProcess和BeanPostProcessor
- [ ] 应用上下文ApplicationContext
- [ ] bean的初始化和销毁方法
- [ ] Aware接口
- [ ] bean作用域，增加prototype的支持
- [ ] FactoryBean
- [ ] 容器事件和事件监听器

#### AOP

- [ ] 切点表达式
- [ ] 基于JDK的动态代理
- [ ] 基于CGLIB的动态代理
- [ ] AOP代理工厂ProxyFactory
- [ ] 几种常用的Advice: BeforeAdvice/AfterAdvice/AfterReturningAdvice/ThrowsAdvice
- [ ] PointcutAdvisor：Pointcut和Advice的组合
- [ ] 动态代理融入bean生命周期

### 扩展篇

- [ ] PropertyPlaceholderConfigurer
- [ ] 包扫描
- [ ] @Value注解
- [ ] 基于注解@Autowired的依赖注入
- [ ] 类型转换（一）
- [ ] 类型转换（二）

### 高级篇

- [ ] 解决循环依赖问题（一）：没有代理对象
- [ ] 解决循环依赖问题（二）：有代理对象
