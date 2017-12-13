package Annotation;

/**
 * Created by Administrator on 2016/8/25.
 */

public class HelloWorldst {

    @HelloWorld(name = "小明")
    public String sayHello(String name) {
        if (name == null ) {
            name = "";
        }
        return name + " say hello world!";
    }
}

