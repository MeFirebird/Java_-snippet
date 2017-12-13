/**
 * Created by Administrator on 2016/7/25.
 */
public class Singleton {

    private static Singleton instance;     // 私有静态

    // 私有的构造器，仅供此类内部使用
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();      // 调用构造器
        }
        return  instance;
    }

    public static void main(String[] args){
        Singleton s1 = Singleton.getInstance();
        Singleton s2= Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
