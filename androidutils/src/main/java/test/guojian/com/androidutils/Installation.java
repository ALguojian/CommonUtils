package test.guojian.com.androidutils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.UUID;

/**
 * Created by Hello on 2017/9/22.
 */

public class Installation {

    private static final String INSTALLATION = "INSTALLATION";

    /**
     * @return 活动页面唯一标识码
     */
    public static String getJustOneKey() {

        String ss = Build.SERIAL;

        String m_szDevIDShort = "g" +

                Build.BOARD.length() % 10 +
                Build.BRAND.length() % 10 +
                Build.CPU_ABI.length() % 10 +
                Build.DEVICE.length() % 10 +
                Build.DISPLAY.length() % 10 +
                Build.HOST.length() % 10 +
                Build.ID.length() % 10 +
                Build.MANUFACTURER.length() % 10 +
                Build.MODEL.length() % 10 +
                Build.PRODUCT.length() % 10 +
                Build.TAGS.length() % 10 +
                Build.TYPE.length() % 10 +
                Build.USER.length() % 10;

        return MD5Encryption.MD5(getReallykey(ss) + m_szDevIDShort);
    }

    private static String getReallykey(String key) {

        if (key != null && !key.isEmpty())
            return key;
        return null;
    }

    /**
     * @param context application对象
     * @return uuid
     */
    public synchronized static String id(Context context) {

        String userId;

        File installation = new File(context.getFilesDir(), INSTALLATION);
        try {
            if (!installation.exists())
                writeInstallationFile(installation);
            userId = readInstallationFile(installation);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "g" + userId.replace("-", "");

    }


    private static String readInstallationFile(File installation) throws IOException {
        RandomAccessFile f = new RandomAccessFile(installation, "r");
        byte[] bytes = new byte[(int) f.length()];
        f.readFully(bytes);
        f.close();
        return new String(bytes);
    }

    private static void writeInstallationFile(File installation) throws IOException {
        FileOutputStream out = new FileOutputStream(installation);
        String id = UUID.randomUUID().toString();
        out.write(id.getBytes());
        out.close();
    }


    /**
     * 得到包名
     *
     * @param pckName
     * @return
     */
    public static PackageInfo getPackageInfo(Context context, String pckName) {
        try {
            return context.getPackageManager().getPackageInfo(pckName, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("haha", e.getMessage());
        }
        return null;
    }
}
