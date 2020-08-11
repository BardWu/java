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
public @interface MyAutowride {

}
