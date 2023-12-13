package kim.nzxy.spel;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * @author ly-chn
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({METHOD, FIELD, PARAMETER, LOCAL_VARIABLE, ANNOTATION_TYPE})
public @interface SpELFieldCollector {
    SpELField[] value();
}
