# CrowdFunding -- 尚筹网

尚筹网项目作为我的第一个独立开发项目。

这个项目是从单一架构阶段到分布式架构阶段的过渡。其中在后台管理员系统使用单一架构开发。前台会员系统使用分布式架构开发。

非常适合作为刚学习完SSM以及SpringBoot和SpringCloud，还不懂得如何熟练运用的开发人员作为练习项目。

------

## 项目简介

该项目是帮助创业者发布创业项目，向大众募集启动资金的融资平台。

## 1. 后台管理员系统

### 前置要求

- Spring
- SpringMVC
- MyBatis
- Maven

### 1.1 搭建环境

**Maven作为构建管理和依赖管理工具**

**SpringMVC作为Web层框架**

- 普通请求：返回响应体通常为一个页面
- Ajax请求：返回响应体通常为一个JSON数据

**MyBatis作为持久层框架**

**MyBatis的PageHelper插件实现数据的分页显示**

- Admin数据
- Role数据

**Spring提供的容器管理项目中的组件**

- XxxHandler
- XxxService
- XxxMapper
- XxxInterceptor
- XxxExceptionResolver

**前端技术**

- Bootstrap作为前端样式框架
- 使用layer作为弹层组件
- 使用zTree在页面上显示树形结构

**借助SpringMVC提供的异常映射机制实现项目中错误消息的统一管理**

- 基于注解
- 基于XML

**通过对请求消息头信息的判断在给出异常处理结果时实现了普通请求和Ajax请求的兼容**

### 1.2 管理员登录

- MD5密码加密

- 使用自定义拦截器检查登录状态

### 1.3 管理员维护

- 使用MyBatis的PageHelper插件实现分页

- 在页面上使用了Pagination实现数字页码

- 在数据库表中给loginacct字段添加唯一约束，在保存了重复的loginacct时触发异常，从而保证登录账号的唯一

### 1.4 角色维护

- 以Ajax交互方式实现数据的增删查改操作

- 在增删改操作中都使用到了layer弹层组件弹出模态框

### 1.5 菜单维护

- 使用zTree在页面上显示树形结构，并结合zTree提供的API显示自定义图标

- 对树形节点进行增删查改操作

### 1.6 RBAC模型

- Role Based Authentication Control 或者 Role Based Access Control
- 基于角色的权限控制 或者 基于角色的访问控制
- Role --> Authority

### 1.7 分配资源

- 给Admin分配Role
- 给Role分配Auth

### 1.8 权限控制

使用SpringSecurity接管项目的登录、登录检查、权限验证

> 这里需要注意：要改源码，让SpringSecurity在初始化时不要查找IOC容器，而是在第一次请求时查找；查找的IOC容器也改成了查找SpringMVC的IOC容器（也就是由DispatcherServlet的父类FrameworkServlet初始化的IOC容器）。

- 登录验证：将登录表单对接到SpringSecurity
- 登录检查：SpringSecurity内置
- 全局配置：在SpringSecurity配置类中设定
- 权限规则注解：@PreAuthority
- 页面标签：对页面局部进行权限限定，实现细粒度权限控制

---

## 2. 前台会员系统

### 2.1 搭建环境

- SpringBoot
  - SpringSession
  - Thymeleaf
  - Redis
  - MyBatis
- SpringCloud
  - Eureka：注册中心
  - Feign：远程接口的声明式调用
  - Ribbon：客户端负载均衡
  - Zuul：网关，ZuulFilter过滤

### 2.2 用户登录、注册

- 调用第三方接口给用户手机发送短信验证码
- 使用BCryptPasswordEncoder实现带盐值的加密
- 使用SpringSession解决分布式环境下Session不一致的问题
- 使用Redis作为SpringSession的Session库
- 在Zuul中使用ZuulFilter实现登录状态检查
- 在Zuul中配置访问各个具体微服务的路由规则

### 2.3 发布项目

使用阿里云OSS对象存储服务保存用户上传的图片

### 2.4 展示项目

将数据库中的项目数据查询出来到页面上显示

### 2.5 支持项目

- 确认回报信息
- 生成订单
- 进入支付流程：调用支付宝开放平台提供支付接口

---

## 3. 部署发布

- 租赁阿里云ECS弹性服务器
- 安装应用程序
  - JDK
  - Tomcat
  - MySQL
  - Redis
- 修改项目的连接信息等参数
- 打包
  - war包
  - jar包
- 上传
- 启动
- 访问


