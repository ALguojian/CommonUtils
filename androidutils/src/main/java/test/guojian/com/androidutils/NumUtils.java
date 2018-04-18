package test.guojian.com.androidutils;

import java.text.DecimalFormat;

/**
 * 数字格式化，生成两位小数
 *
 * @author alguojian
 */

public class NumUtils {

    public static String getTwoPointPrice(float price) {
        DecimalFormat format = new DecimalFormat("0.00");
        return format.format(price);
    }
}
