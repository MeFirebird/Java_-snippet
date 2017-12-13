package demo;

/**
 * 验证码生成
 */
public class RandomStr {
    public static void main(String[] args){

        String result = "";
        for(int i=0; i<6; i++){
            // 注意这里哦，Math.random() 0-1之间的随机数哦！
            int intVal = (int)(Math.random() * 26 + 97);
            System.out.println(intVal);
            result = result + (char)intVal;
        }
        System.out.println(result);
    }
}
