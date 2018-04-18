package test.guojian.com.androidutils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/**
 * 打开微信以及复制粘贴板
 * 2018/3/29.
 *
 * @author alguojian
 */

public class OpenWeChatUtils {

    public static void openWX(Context context) {

        Intent intent = new Intent();
        ComponentName cmp = new ComponentName("com.tencent.mm", "com.tencent.mm.ui.LauncherUI");
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setComponent(cmp);
        context.startActivity(intent);

    }

    /**
     * 复制文字到粘贴板
     *
     * @param context
     * @param string
     */
    public static void copyText(Context context, String string) {

        if (null == string) {
            return;
        }
        // 获取系统剪贴板
        ClipboardManager clipboard = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);

        // 创建一个剪贴数据集，包含一个普通文本数据条目（需要复制的数据）
        ClipData clipData = ClipData.newPlainText(null, string);

        // 把数据集设置（复制）到剪贴板
        clipboard.setPrimaryClip(clipData);
    }
}
