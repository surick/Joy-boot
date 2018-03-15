package com.joy.modules.activiti.annotation;

import java.lang.annotation.*;

/**
 * 在实体类中对字段进行注解，业务表名
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ActTable {
    /**
     * 业务表名
     * @return
     */
    String tableName();

    /**
     * 数据库主键
     * @return
     */
    String pkName();
}
