package com.mybatis.puls.mybatisPuls.definedMethod;

import com.baomidou.mybatisplus.core.metadata.TableInfo;
import com.mybatis.puls.mybatisPuls.config.DefinedMethod;
import com.mybatis.puls.mybatisPuls.config.DefinedSqlMethod;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;

/**
 * @author: zhoujiong
 * @description: 自定义注入sql，参考AbstractMethod中已实现的方法
 * @className: deleteAll
 * @date: 2019/6/5 15:38
 */
public class DeleteAll extends DefinedMethod {

    @Override
    public MappedStatement injectMappedStatement(Class<?> mapperClass, Class<?> modelClass, TableInfo tableInfo) {
        DefinedSqlMethod sqlMethod;
        String sql;
        SqlSource sqlSource;
        if (tableInfo.isLogicDelete()) {
            return null;
        } else {
            sqlMethod = DefinedSqlMethod.DELETE_ALL;
            sql = String.format(sqlMethod.getSql(), tableInfo.getTableName());
            sqlSource = this.languageDriver.createSqlSource(this.configuration, sql, modelClass);
            return this.addDeleteMappedStatement(mapperClass, sqlMethod.getMethod(), sqlSource);
        }
    }
}
