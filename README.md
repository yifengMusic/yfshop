# yfshop 一丰商城(Spring Boot + Spring Cloud版)
此项目为本人空闲时间为了更好的熟悉Spring Boot + Spring Cloud 分布式微服务架构解决方案编写的实战项目  
## 目前暂时只完成项目基本架构。
分布式链路追踪，分布式服务监控，分布式协调系统，分布式配置中心，Spring Cloud 全家桶解决方案 来做到高可用,高性能，高并发   
单点登录，文件上传下载，缓存，分页，熔断跳转页面,CDN,持续集成等功能   

## 开发环境    
操作系统：Windows 7 Enterprise  
开发工具：Intellij IDEA 2018  
数据库：MySQL 5.7.22  
Java SDK：Oracle JDK 1.8.152  
## 部署环境  
操作系统：Linux Ubuntu Server 16.04 X64   
虚拟化技术：VMware + Docker   
## 项目管理工具
项目构建：Maven + Nexus    （依赖管理平台）  
代码管理：Git + GitLab     （代码管理平台）  
镜像管理：Docker +Registry （镜像管理平台）  
## 后台主要技术栈  
分布式微服务配置中心：Spring Cloud Config  
分布式微服务链路追踪：Spring Cloud ZipKin    
分布式微服务协调系统：Spring Cloud Eureka  
分布式微服务服务监控：Spring Boot Admin   
分布式微服务文件系统：Alibaba FastDFS  
分布式微服务日志系统：ELK（ElasticSearch + Logstash + Kibana）  
核心框架：Spring Boot + Spring Cloud   
视图框架：Spring MVC  
数据库缓存：Redis Sentinel   (哨兵模式)  
页面引擎：Thymeleaf  
ORM 框架：tk.mybatis 简化 MyBatis 开发  
数据库连接池：Alibaba Druid  
接口文档引擎：Swagger2 RESTful 风格 API 文档生成  
反向代理负载均衡+跨域：Nginx  
## 前端主要技术栈     
前端框架：Bootstrap + jQuery +javascript   
前端模板：AdminLTE  
## 自动化运维  
持续集成：GitLab + GitLab Runner  (持续集成)  
持续交付：Jenkins                 (运维)    

### 代码实际完成时间为2019年1月，代码仅可以作为学习用途使用，不可用于任何商业行为 
#### 下载源码后还需配置相关的技术栈的环境 在相关配置文件中替换成自己的地址即可正常使用  
如:  
Nexus   GitLab  Registry  FastDFS   Redis Sentinel   Nginx   Jenkins
