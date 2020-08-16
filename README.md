# service-set（应用场景服务集）

#### sharding-service（分库分表场景服务）
##### 功能介绍
+ 水平分表实现 
+ 水平分库分表实现 
+ 专库专表实现
+ 多数据源公共表实现
+ 读写分离实现
#### 数据库配置 & 初始化脚本
+ sharding_db_0
    + t_course_0
    + t_course_1
    + t_dict
+ sharding_db_1
    + t_course_0
    + t_course_1
    + t_dict 
+ sharding_order
    + t_order
+ sharding_user
    + t_dict
    + t_user        