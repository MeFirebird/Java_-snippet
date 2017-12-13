package DateAndTime;

import java.util.Date;

/**
 * Created by Administrator on 2017/3/6.
 */
public class SimpleDateFormat {
    /**
     * 全局默认日期格式
     */
    public static final String Format_Date = "yyyy-MM-dd";

    /**
     * 全局默认时间格式
     */
    public static final String Format_Time = "HH:mm:ss";

    /**
     * 全局默认日期时间格式
     */
    public static final String Format_DateTime = "yyyy-MM-dd HH:mm:ss";

    public static String getCurrentDateTime(String format) {

        java.text.SimpleDateFormat t = new java.text.SimpleDateFormat(format);
        return t.format(new Date());
    }


    public static void main(String[] args){

        System.out.println(getCurrentDateTime(Format_Date));
    }
}
