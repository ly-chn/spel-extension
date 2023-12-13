package kim.nzxy.spel;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * Annotation for SpEL (Spring Expression Language) variable.
 *
 * @author ly-chn
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({METHOD, FIELD, PARAMETER, LOCAL_VARIABLE, ANNOTATION_TYPE})
@Repeatable(SpELFieldCollector.class)
public @interface SpELField {
    /**
     * Name of the variable in the SpEL expression.
     */
    String name();

    /**
     * The type of the variable.
     * If typeStr is provided, this value will be ignored.
     */
    Class<?> type() default Object.class;

    /**
     * The type of the variable as a String,
     * which will be parsed as a Java class, supports generics.
     * <p>
     * Example:
     * {@code @SpELField(name = "demo", typeStr = "java.util.List<java.lang.String>")}
     */
    String typeStr() default "";
}
