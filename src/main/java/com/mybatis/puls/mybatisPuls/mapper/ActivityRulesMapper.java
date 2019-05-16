package com.mybatis.puls.mybatisPuls.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybatis.puls.mybatisPuls.entity.ActivityRules;

import java.util.List;


/**
 * @author: zhoujiong
 * @description: Mapper接口
 * @className: ActivityRulesMapper
 * @date: 2019-05-14
 */
public interface ActivityRulesMapper extends BaseMapper<ActivityRules> {

    List selectActivityRules();

    List<ActivityRules> selectPage(Page<ActivityRules> page);
}
