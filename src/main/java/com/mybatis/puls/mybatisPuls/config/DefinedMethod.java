package com.mybatis.puls.mybatisPuls.config;

import com.baomidou.mybatisplus.core.injector.AbstractMethod;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import org.apache.ibatis.mapping.MappedStatement;

/**
 * @author: zhoujiong
 * @description: 自定义注入sql
 * @className: DefinedMethod
 * @date: 2019/6/5 15:37
 */
public abstract class DefinedMethod extends AbstractMethod {

    public abstract MappedStatement injectMappedStatement(Class<?> mapperClass, Class<?> modelClass, TableInfo tableInfo);

}
