package annotation;

import java.lang.annotation.*;

/**
 * 自定义校验注解-年龄
 *
 * @Author: 88397353
 * @Date: 2019/5/28
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidateAnt {

    int min() default 1;

    int max() default 100;

    boolean isNotNull() default true;

}
