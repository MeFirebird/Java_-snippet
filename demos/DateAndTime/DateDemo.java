package DateAndTime;

import java.text.SimpleDateFormat;

/**
 * Created by Administrator on 2017/1/13.
 */
public class DateDemo {
    public static  void  main(String[] args){

        System.out.println(date());
    }

    public static String date(){
        java.util.Date now = new java.util.Date();
        System.out.println("未处理前：" + now);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        return simpleDateFormat.format(now);
    }

}
