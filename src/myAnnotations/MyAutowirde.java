package myAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-08-04 16:35
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD )
public @interface MyAutowirde {
    /**
     * 原注解：
     * @Retention 的英文意为保留期的意思，这个注解的的存活时间
     * @Target 指定了注解运用的地方 比如只能张贴到方法上、类上、方法参数上等等
     */
}
