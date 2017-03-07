/**
 * Created by Administrator on 2016/12/5.
 */
public class OutputClassPath {
    public static void main(String[] args){
        String classPaht = OutputClassPath.class.getResource("/").getPath();
        System.out.println(classPaht);     // 还不是父级目录哦！
    }
}
