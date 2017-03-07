package String;

/**
 * Created by Administrator on 2017/2/16.
 */
public class StringTest {

    public static void main(String[] agrs){

     String a = "hello world";
    // 1.判断字符串是否为空


    // 二.字符串常用属性和方法

    System.out.println("字符串的长度是：" + a.length());

     /* lastIndexof(char c)   没有就返回-1，有就返回它出现的位置*/
    System.out.println(a.lastIndexOf('h'));    // System.out.println() 这句必须出现在main()方法里哦

    /*  substring  */
    System.out.println(a.substring(9));

    /* endsWith */

    /* toString */

   /* getBytes */

    }
}
