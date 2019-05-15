package com.mybatis.puls.mybatisPuls.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mybatis.puls.mybatisPuls.entity.ActivityRules;

import java.util.List;

/**
 * @author: zhoujiong
 * @description: TODO
 * @className: IActivityRulesService
 * @date: 2019-05-14
 */

public interface IActivityRulesService extends IService<ActivityRules> {

    List selectActivityRules();
}
