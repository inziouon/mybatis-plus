package com.mybatis.puls.mybatisPuls.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: zhoujiong
 * @description: 自定义填充公共字段, 与@TableField fill属性绑定
 * @className: MyMetaObjectHandler
 * @date: 2019/5/16 17:40
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    /**
     * @author: zhoujiong
     * @description: 插入填充
     * @date: 2019/5/17 9:55
     * @param: [metaObject]
     * @return: void
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

    /**
     * @author: zhoujiong
     * @description: 更新填充
     * @date: 2019/5/17 9:55
     * @param: [metaObject]
     * @return: void
     */
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
