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

        return new SimpleDateFormat("yyyy-MM-dd ").format(new Date(time)).toString();
    }

    /**
     * @param time
     * @return Data类型日期格式化
     */
    public static String getTimeForData(Date time) {

        return new SimpleDateFormat("yyyy-MM-dd ").format(time).toString();
    }

    /**
     * @param
     * @return time long类型日期格式化-带时分秒
     */
    public static String getlongTimeForLong(long time) {

        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date(time)).toString();
    }

    /**
     * @param
     * @return time Data类型日期格式化-带时分秒
     */
    public static String getlongTimeForData(Date time) {

        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(time).toString();
    }


    /**
     * \
     *
     * @param
     * @return data Data转化为long类型
     * @throws ParseException
     */
    public static long getLongForData(Date data) throws ParseException {

        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").parse(String.valueOf(data)).getTime();

    }
}
