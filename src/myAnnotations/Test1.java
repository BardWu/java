package myAnnotations;

/**
 * @program: java
 * @description:
 * @author: wh
 * @create: 2020-08-06 16:20
 **/
@TestAnnotation(id=1,msg="test")
public class Test1 {

    /**RetentionPolicy.RUNTIME
     * override : RetentionPolicy.SOURCE
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }

    @SuppressWarnings("deprecation")
    public void testDeprecated(){

    }
}
