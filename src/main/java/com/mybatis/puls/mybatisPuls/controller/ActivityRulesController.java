package com.mybatis.puls.mybatisPuls.controller;


import com.mybatis.puls.mybatisPuls.service.IActivityRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhoujiong
 * @description: Controller
 * @className: ActivityRulesController
 * @date: 2019-05-14
 */


@RestController
@RequestMapping("/activityRules")
public class ActivityRulesController extends BaseController {


    @Autowired
    IActivityRulesService activityRulesService;

    @RequestMapping("test")
    public void text(){
        System.out.println(activityRulesService.selectActivityRules().toString());
    }
}

