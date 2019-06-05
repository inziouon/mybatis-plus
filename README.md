# mybatis-plus
mybatis-plus与spring boot 快速开发。目前使用mybatis-plus版本为最新的3.1.1

配置：

1、配置pom.xml文件，引入mybatis-plus-boot-starter.jar

2、配置application.yml文件，添加相关数据库与mybatis-plus配置信息

3、配置代码生成器，生成对应entity，controller，service，mapper，impl

4、在启动类中配置@MapperScan，扫描mapepr文件路径

5、启动测试

应用：

1、条件构造器Wrapper的使用

2、分页插件的使用 注入 paginationInterceptor Bean

3、性能插件的使用 注入 performanceInterceptor Bean

4、主键Sequence使用，设置GlobalConfig.DbConfig.setKeyGenerator()

5、自动填充注解 @TableField(fill = FieldFill.INSERT) 使用
    
    建立MyMetaObjectHandler实现MetaObjectHandler并重写其中insertFill和updateFill方法
6、注入自定义SQL