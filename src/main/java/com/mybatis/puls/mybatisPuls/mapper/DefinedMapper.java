package com.mybatis.puls.mybatisPuls.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface DefinedMapper<T> extends BaseMapper<T> {

    int deleteAll();
}
