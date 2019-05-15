package com.mybatis.puls.mybatisPuls.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author: zhoujiong
 * @description: Entity类
 * @className: ActivityRulesController
 * @date: 2019-05-14
 */


@Data
@EqualsAndHashCode(callSuper = true)
@TableName("activity_rules")
public class ActivityRules extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 活动规则id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 活动优惠条件
     * TODO 由于condition为mysql中关键字，所以加上TableField(exist = false)取消mybatis和mysql的映射关系，此时默认返回为null
     *      注意建表时千万不要以condition为字段
     */
    @TableField(exist = false)
    private BigDecimal condition;
    /**
     * 活动优惠
     */
    private BigDecimal discount;
    /**
     * 模板表id  平台活动中使用
     */
    private Long activityTempId;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date modifyTime;
    /**
     * 活动规则
     */
    private String remark;
    /**
     * 1-有效，0-无效
     */
    @TableLogic
    private Integer enabled;
    /**
     * 备用字段1
     */
    private String data1;
    /**
     * 备用字段2
     */
    private String data2;


}
