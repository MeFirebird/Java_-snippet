package Annotation;

import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2016/8/25.
 */
public class TestHelloWorld {

    @Test
    public void testHello() throws IllegalArgumentException,
            IllegalAccessException, InvocationTargetException,
            SecurityException, NoSuchMethodException, InstantiationException {

        //定义操作类
        ParseAnnotation parse = new ParseAnnotation();

        //假设我们知道类HelloWorldStub使用了注解，执行HelloWorldStub中带注解的方法
        //判断是否使用了注解的name()方法，设置name = "小明"，并返回"小明 say hello world!"
        String returnValue = parse.parseMethod(HelloWorld.class);
        assertEquals("小明 say hello world!", returnValue) ;

    }
}
