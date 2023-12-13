package kim.nzxy.spel;

import java.lang.annotation.Annotation;

/**
 * 对字段/变量添加SpEL代码提示支持
 * @author ly-chn
 */
public @interface SpELWith {
    /**
     * 对应的注解
     */
    Class<? extends Annotation> anno();

    /**
     * 注解字段名称
     */
    String field() default "value";
}