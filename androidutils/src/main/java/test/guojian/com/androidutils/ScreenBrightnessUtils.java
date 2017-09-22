package test.guojian.com.androidutils;

import android.app.Activity;
import android.content.ContentResolver;
import android.provider.Settings;
import android.view.WindowManager;

/**
 * Created by Hello on 2017/9/22.
 * 屏幕亮度设置
 */

public class ScreenBrightnessUtils {

    /**
     * 获取屏幕亮度
     */
    public static int getScreenBrightness(Activity activity) {
        int value = 0;
        ContentResolver cr = activity.getContentResolver();

        try {
            value = Settings.System.getInt(cr, Settings.System.SCREEN_BRIGHTNESS);

        } catch (Settings.SettingNotFoundException e) {

            e.printStackTrace();
        }
        return value;
    }

    /**
     * 设置屏幕亮度
     */
    public static void setScreenBrightness(Activity activity, int value) {
        WindowManager.LayoutParams params = activity.getWindow().getAttributes();
        params.screenBrightness = value / 255f;
        activity.getWindow().setAttributes(params);
    }

}
