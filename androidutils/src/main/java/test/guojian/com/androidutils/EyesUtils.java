package test.guojian.com.androidutils;

import android.text.InputType;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by Hello on 2017/9/22.
 */

public class EyesUtils {

    /**
     * 显示密码和隐藏密码
     * @param eyes 控件对象
     * @param ed
     * @param id 展开眼睛图片drawable ID
     * @param reid
     */
    public static void showOrHidePassword(ImageView eyes, EditText ed,int id,int reid) {
        if (eyes.getTag() == null) {
            eyes.setTag("show");
            eyes.setImageResource(id);
            ed.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
            ed.setSelection(ed.length());
        } else {
            eyes.setTag(null);
            eyes.setImageResource(reid);
            ed.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
            ed.setSelection(ed.length());
        }
    }
}
