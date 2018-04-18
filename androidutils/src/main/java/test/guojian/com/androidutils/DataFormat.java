package test.guojian.com.androidutils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Hello on 2017/9/22.
 */

public class DataFormat {

    /**
     * @param time
     * @return long类型日期格式化
     */
    public static String getTimeForLong(long time) {

        return new SimpleDateFormat("yyyy-MM-dd").format(new Date(time));
    }

    /**
     * @param time
     * @return Data类型日期格式化
     */
    public static String getTimeForData(Date time) {

        return new SimpleDateFormat("yyyy-MM-dd").format(time);
    }

    /**
     * @param time 时间
     * @return time long类型日期格式化-带时分秒
     */
    public static String getStringTimeForLong(long time) {

        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(time));
    }

    /**
     * @param
     * @return time long类型日期格式化-带时分秒
     */
    public static String getStringTimeForLongAndMonthAndmin(long time) {

        return new SimpleDateFormat("MM-dd HH:mm").format(new Date(time));
    }

    /**
     * @param
     * @return time long类型日期格式化-带时分秒
     */
    public static String getStringTimeForLongAndMonthAndDay(long time) {

        return new SimpleDateFormat("MM-dd").format(new Date(time));
    }

    /**
     * @param
     * @return time long类型日期格式化-只有天数
     */
    public static String getStringTimeForLongJustDay(long time) {

        return new SimpleDateFormat("dd").format(new Date(time));
    }


    /**
     * @param
     * @return time long类型日期格式化-只有天数
     */
    public static String getStringTimeForLongJustMonth(long time) {

        return new SimpleDateFormat("MM").format(new Date(time));
    }

    /**
     * @param
     * @return time long类型日期格式化-只有天数
     */
    public static String getStringTimeForDateJustDay(Date time) {

        return Integer.parseInt(new SimpleDateFormat("dd").format(time))+"";

    }


    /**
     * @param
     * @return time long类型日期格式化-只有天数
     */
    public static String getStringTimeForDateJustYear(Date time) {

        return new SimpleDateFormat("yyyy").format(time);
    }

    /**
     * @param
     * @return time long类型日期格式化-只有月份
     */
    public static int getStringTimeForDateJustMonth(Date time) {

        return Integer.parseInt(new SimpleDateFormat("MM").format(time));
    }

    /**
     * @param
     * @return time long类型日期格式化-带时分秒
     */
    public static String getStringTimeForLongAndMonthAnd(long time) {

        return new SimpleDateFormat("MM-dd HH:mm:ss").format(new Date(time));
    }

    /**
     * @param
     * @return time Data类型日期格式化-带时分秒
     */
    public static String getStringTimeForData(Date time) {

        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time);
    }

}
