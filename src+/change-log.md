**step-1~step-5执行顺序的总结**<br />
1.首先需要获取配置文件：对应的类为IResource接口以及其对应的实现类，主要完成对外部资源的获取.<br />
2.其次需要将资源文件初始化成对应的bean的定义，及BeanDefinition.并且通过IBeanDefinitionReader接口以及其实现类，将BeanDefinition保存在容器中。<br />
3.然后通过IBeanFactory接口以及其实现类从上一步的存放BeanDefinition的容器中将其逐个实例化，然后存放在另外的一个容器中。<br />
4.最后从实例容器中拿出需要的bean使用。<br />
