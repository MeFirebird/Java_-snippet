package demo;

/** toString()方法
 * Created by Administrator on 2016/12/29.
 */
public class ToString {

    int age;
    String name;
    String dream;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDream() {
        return dream;
    }

    public void setDream(String dream) {
        this.dream = dream;
    }

    @Override
    public String toString() {
        return "ToString{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", dream='" + dream + '\'' +
                '}';
    }

    public static void main(String[] args){
        ToString toString = new ToString();
        System.out.println(toString);
    }
}
