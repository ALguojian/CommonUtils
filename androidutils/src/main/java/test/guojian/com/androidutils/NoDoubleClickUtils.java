package test.guojian.com.androidutils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Hello on 2017/9/22.
 */
//防止用户多次点击同一个按钮造成多余操作
public class NoDoubleClickUtils {

    private static long lastClickTime=0;
    private final static int SPACE_TIME = 500;

    public synchronized static boolean isDoubleClick(Context context) {
        long currentTime = System.currentTimeMillis();
        boolean isClick2;
        if (currentTime - lastClickTime > SPACE_TIME) {
            isClick2 = false;
        } else {
            isClick2 = true;

            Toast.makeText(context,"请勿重复操作",Toast.LENGTH_SHORT).show();
        }
        lastClickTime = currentTime;
        return isClick2;
    }
}
