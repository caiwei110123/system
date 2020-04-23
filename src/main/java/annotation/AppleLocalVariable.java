package annotation;

import java.lang.annotation.*;

/**
 * 功能描述：
 *
 * @author : yilie
 * @date : 2019/7/24  下午4:37
 * @Version 1.0
 */
@Target({ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface AppleLocalVariable {
    String name();
    String sex() default "男11111";
    String phone() default "15931787945";
    int age() default 2;
}