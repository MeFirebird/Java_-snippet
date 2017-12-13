package DateAndTime;

import jodd.util.StringUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2017/2/13.
 */
public class DateUtil {

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

    /**
     * 以指定的格式返回当前日期时间的字符串
     *
     * @param format
     * @return
     */
    public static String getCurrentDateTime(String format) {

        SimpleDateFormat t = new SimpleDateFormat(format);
        return t.format(new Date());
    }

    /**
     * 以yyyy-MM-dd格式输出只带日期的字符串
     */
    public static String toString(Date date) {

        if (date == null) {
            return "";
        }
        return new SimpleDateFormat(Format_Date).format(date);
    }

    /**
     * 将字符串日期转换为指定格式的字符串日期 "yyyy-MM-dd HH:mm:ss"
     *
     * @param dateStr
     * @return
     */
    public static String toStringFromString(String dateStr) {
        Date date = parse(dateStr, Format_DateTime);
        return toString(date, Format_DateTime);
    }

    /**
     * 将字符串日期转换为指定格式的字符串日期
     *
     * @param dateStr
     * @return
     */
    public static String toStringFromString(String dateStr, String format_Date) {
        Date date = parse(dateStr, Format_DateTime);
        return toString(date, format_Date);
    }

    /**
     * 按指定的format输出日期字符串
     */
    public static String toString(Date date, String format) {

        SimpleDateFormat t = new SimpleDateFormat(format);
        return t.format(date);
    }

    /**
     * 按指定格式解析字符串，并返回相应的java.util.Date对象
     *
     * @param str
     * @param format
     * @return
     */
    public static Date parse(String str, String format) {

        if (StringUtil.isEmpty(str)) {
            return null;
        }
        try {
            SimpleDateFormat t = new SimpleDateFormat(format);
            return t.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 日期date上加count分钟，count为负表示减
     */
    public static Date addMinute(Date date, int count) {

        return new Date(date.getTime() + 60000L * count);
    }

    /**
     * 日期date上加count小时，count为负表示减
     */
    public static Date addHour(Date date, int count) {

        return new Date(date.getTime() + 3600000L * count);
    }

    /**
     * 日期date上加count天，count为负表示减
     */
    public static Date addDay(Date date, int count) {

        return new Date(date.getTime() + 86400000L * count);
    }

    /**
     * 日期date上加count星期，count为负表示减
     */
    public static Date addWeek(Date date, int count) {

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.WEEK_OF_YEAR, count);
        return c.getTime();
    }

    /**
     * 日期date上加count月，count为负表示减
     */
    public static Date addMonth(Date date, int count) {

		/* ${_ZVING_LICENSE_CODE_} */

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.MONTH, count);
        return c.getTime();
    }

    /**
     * 日期date上加count年，count为负表示减
     */
    public static Date addYear(Date date, int count) {

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.YEAR, count);
        return c.getTime();
    }

    /**
     * 人性化显示时间日期
     *
     * @param date
     * @return
     */
    public static String toDisplayDateTime(Date date) {

        long minite = (System.currentTimeMillis() - date.getTime()) / 60000L;
        if (minite < 60) {
            return toString(date, "MM-dd") + " " + minite + "分钟前";
        }
        if (minite < 60 * 24) {
            return toString(date, "MM-dd") + " " + minite / 60L + "小时前";
        } else {
            return toString(date, "MM-dd") + " " + minite / 1440L + "天前";
        }
    }


    //  main方法哦
    public static void main(String[] args) {

        String method = toDisplayDateTime(new Date());
        System.out.println(method);

    }


}
