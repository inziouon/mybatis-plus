package com.mybatis.puls.mybatisPuls;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mybatis.puls.mybatisPuls.entity.ActivityRules;
import com.mybatis.puls.mybatisPuls.service.IActivityRulesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPulsApplicationTests extends ApplicationObjectSupport {


	@Test
	public void contextLoads() {
		ApplicationContext applicationContext = getApplicationContext();
		IActivityRulesService activityRulesService = (IActivityRulesService) applicationContext.getBean("activityRulesService");
		System.out.println(activityRulesService.list(new LambdaQueryWrapper<ActivityRules>().eq(ActivityRules::getId, 20)).toString());//查询
	}

	@Test
	public void insert() {
		ApplicationContext applicationContext = getApplicationContext();
		IActivityRulesService activityRulesService = (IActivityRulesService) applicationContext.getBean("activityRulesService");

		ActivityRules activityRules = new ActivityRules();
		activityRules.setCondition(new BigDecimal(100));
		activityRules.setDiscount(new BigDecimal(100));
		activityRules.setActivityTempId(19L);
		activityRules.setRemark("mybatis-plus");
		activityRulesService.save(activityRules);
	}

}
