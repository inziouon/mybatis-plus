package com.mybatis.puls.mybatisPuls.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: zhoujiong
 * @description: 自定义填充公共 name 字段, 与@TableField fill属性绑定
 * @className: MyMetaObjectHandler
 * @date: 2019/5/16 17:40
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    /**
     * 测试 user 表 name 字段为空自动填充
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        // 更多查看源码测试用例
        System.out.println("*************************");
        System.out.println("insert fill");
        System.out.println("*************************");

        // 测试下划线
        //mybatis-plus版本2.0.9+
        Object testType = getFieldValByName("createTime", metaObject);
        System.out.println("createTime=" + testType);
        //mybatis-plus版本2.0.9+
        if (testType == null) {
            setFieldValByName("createTime", new Date(), metaObject);
            setFieldValByName("modifyTime", new Date(), metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        //更新填充
        System.out.println("*************************");
        System.out.println("update fill");
        System.out.println("*************************");
        //mybatis-plus版本2.0.9+
        setFieldValByName("modifyTime", new Date(), metaObject);
    }
}
