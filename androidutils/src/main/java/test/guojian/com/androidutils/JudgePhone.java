package test.guojian.com.androidutils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Hello on 2017/9/22.
 */

public class JudgePhone {

    /**
     * 判断是否为手机号
     */
    public static boolean isPhone(String inputText) {
        Pattern p = Pattern.compile("^1(3[0-9]|4[57]|5[0-35-9]|8[0-9]|7[0678])\\d{8}$");
        Matcher m = p.matcher(inputText);
        return m.matches();
    }


}
