/*
 * Copyright 2018 kiwipeach.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mybatis.puls.mybatisPuls.config;

import com.baomidou.mybatisplus.core.config.GlobalConfig;
import com.baomidou.mybatisplus.core.parser.ISqlParser;
import com.baomidou.mybatisplus.extension.incrementer.DB2KeyGenerator;
import com.baomidou.mybatisplus.extension.parsers.BlockAttackSqlParser;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.List;

/**
 * mybatis插件相关配置
 *
 * @author kiwipeach [1099501218@qq.com]
 * @create 2018/08/09
 */
@Configuration
@MapperScan(value = {"com.mybatis.puls.mybatisPuls.mapper"})
public class MybatisPluginsConfiguration {

    /**
     * 分页插件,mybaits-plus官网提供
     *
     * @return paginationInterceptor
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();

        //...

        List<ISqlParser> sqlParserList = new ArrayList<>();
        // 攻击 SQL 阻断解析器、加入解析链
        sqlParserList.add(new BlockAttackSqlParser());
        paginationInterceptor.setSqlParserList(sqlParserList);

        //...

        return paginationInterceptor;
    }

    /**
     * SQL执行效率插件ISqlInjector ISqlInjector
     */
    @Bean
    @Profile({"mysql", "test"})// 设置 dev test 环境开启
    public PerformanceInterceptor performanceInterceptor() {
        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
        //maxTime SQL 执行最大时长，超过自动停止运行，有助于发现问题 毫秒单位
        performanceInterceptor.setMaxTime(5000);

        //format SQL SQL是否格式化，默认false
        performanceInterceptor.setFormat(false);
        return performanceInterceptor;
    }


    /**
     * @author: zhoujiong
     * @description: 主键设置
     * @date: 2019/5/16 16:02
     * @param: []
     * @return: com.baomidou.mybatisplus.core.config.GlobalConfig.DbConfig
     */
    @Bean
    public GlobalConfig.DbConfig dbConfig(){
        GlobalConfig.DbConfig gc = new GlobalConfig.DbConfig();
        //不需要这么配置了，自动获取数据库类型
        //gc.setDbType(MYSQL);
        gc.setKeyGenerator(new DB2KeyGenerator());
        return gc;
    }
}
