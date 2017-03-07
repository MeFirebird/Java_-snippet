package 密码;

/**
 * Created by Administrator on 2017/2/28.
 */
public class Demo {

    public static void main(String[] args) {

        String s1 = "java";        //  直接存在栈中吗？
        String s2 = "java";
        String s3 = new String("java");
        String s4 = new String("java");

        System.out.println(s1 == s2);        // true     栈内存中的值：指向堆的地址
        System.out.println(s1.equals(s2));   // true

        System.out.println(s3 == s4);        // false    栈内存中的值不同
        System.out.println(s3.equals(s4));   // true     比较的是堆内存中的值

        System.out.println(s1 == s3);       // false      比较的栈内存中的值
    }
}
