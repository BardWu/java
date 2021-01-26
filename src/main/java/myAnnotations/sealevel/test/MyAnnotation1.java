package myAnnotations.sealevel.test;

import java.lang.annotation.*;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-12-30 15:17
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.FIELD})
public @interface MyAnnotation1 {

}
