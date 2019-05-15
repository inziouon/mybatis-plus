package com.mybatis.puls.mybatisPuls.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mybatis.puls.mybatisPuls.entity.ActivityRules;
import com.mybatis.puls.mybatisPuls.mapper.ActivityRulesMapper;
import com.mybatis.puls.mybatisPuls.service.IActivityRulesService;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author: zhoujiong
 * @description: TODO
 * @className: ActivityRulesServiceImpl
 * @date: 2019-05-14
 */

@Service("activityRulesService")
public class ActivityRulesServiceImpl extends ServiceImpl<ActivityRulesMapper, ActivityRules> implements IActivityRulesService {

    @Override
    public List selectActivityRules(){
       return baseMapper.selectActivityRules();
    }

}
