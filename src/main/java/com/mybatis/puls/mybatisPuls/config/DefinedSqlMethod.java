package com.mybatis.puls.mybatisPuls.config;

/**
 * @author: zhoujiong
 * @description: 自定义注入sql ,自定义方法
 * @className: DefinedSqlMethod
 * @date: 2019/6/5 15:57
 */
public enum DefinedSqlMethod {

    DELETE_ALL("deleteAll", "插入一条数据（选择字段插入）", "<script>\ndelete from %s\n</script>");

    private final String method;
    private final String desc;
    private final String sql;

    private DefinedSqlMethod(String method, String desc, String sql) {
        this.method = method;
        this.desc = desc;
        this.sql = sql;
    }

    public String getMethod() {
        return this.method;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getSql() {
        return this.sql;
    }

}
