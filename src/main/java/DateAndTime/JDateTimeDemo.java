package DateAndTime;

import jodd.datetime.JDateTime;

import java.util.Date;

/**
 * Created by Administrator on 2017/1/13.
 */
public class JDateTimeDemo {

    public static void main(String[] args) {
//        Date date = new Date();  // Fri Jan 13 17:25:12 CST 2017
//        System.out.println(date);
        JDateTime jDateTime = new JDateTime();
        System.out.println(jDateTime.toString("MM")); //2017-01-13 17:25:12

        Date date1 = new JDateTime().convertToDate();
        System.out.println(date1);
    }


}
