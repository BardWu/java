package myAnnotations.sealevel.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-12-30 15:17
 **/
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.METHOD,ElementType.FIELD})
public @interface MyAnnotation3 {

}
