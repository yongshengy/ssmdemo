1. 介绍
    - Spring
        - 2003年兴起的轻量级企业框架，替代传统的EJB开发方式，解决开发复杂的问题。
        - 现在Spring已经有了一个完整的生态，是Java开发的行业标准。
    - Spring MVC
        - Spring Web MVC 是Spring对MVC设计模式的框架，使服务端开发更加简单。
    - MyBatis
        - 主流ORM框架，对JDBC的封装，简单易用
    - SSM
        - Spring, Spring MVC, MyBatis分别负责不同的业务模块
        - Spring MVC负责MVC设计模式的实现
        - MyBatis提供数据持久化解决方案
        - Spring用来管理Spring MVC和MyBatis，IOC容器负责Spring MVC和MyBatis相关对象的创建和注入，AOP负责事务

2. 步骤
    - 导入依赖：spring-webmvc spring-jdbc spring-aspects mybatis mybatis-spring mysql-connector-java c3p0 jstl servlet-api lombok
    - web.xml: spring context listener(spring.xml), spring mvc(load springmvc.xml),characterEncodingFilter, 静态资源走默认servlet
    - 配置文件：
        - dbconfig.properties, spring.xml ->context:propertyplaceholder, 
        - spring.xml: datasource, mybatis- sqlSessionFactory, 接口扫描Bean，transactionManager; spring tx: aop 将spring的AOP事务处理注入到mybatis出来的transactionManager.
        - mybatis: springmvc.xml 
    - entiry, service, dao, controller , mapper 
    - page: bootstrap + jstl标签
    
