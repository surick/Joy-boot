package com.joy.modules.common.annotation;

import java.lang.annotation.*;

/**
 * 数据权限注解类
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataAuth {
    /**  表的别名 */
    String tableAlias() default  "";
}
