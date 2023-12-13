package kim.nzxy.spel;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * SpEL表达式上下文支持
 * @author ly-chn
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ METHOD, FIELD, PARAMETER, LOCAL_VARIABLE, ANNOTATION_TYPE })
public @interface SpELMethod {
    /**
     * support method result type, named that {@link #resultName()}
     */
    boolean result() default false;

    /**
     * var name of method result
     * @see #result()
     */
    String resultName() default "result";

    /**
     * if method, support parameter list as SpEL variables
     */
    boolean parameters() default false;

    /**
     * if provided, parameter name will be prefixed
     * <p>
     * in the example, the `#id` can be replaced with `#p0` or `#a0`
     * .e.g:
     * <blockquote><pre>
     * &#064;SomeAnnotation(value  = "#id")
     * public String demo(String id) {
     *     return null;
     * }
     * </pre></blockquote>
     * @see #parameters()
     */
    String[] parametersPrefix() default {"p", "a"};
}
