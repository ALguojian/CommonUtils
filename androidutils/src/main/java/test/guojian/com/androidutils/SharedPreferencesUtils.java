package test.guojian.com.androidutils;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import java.util.Map;

/**
 * Created by Hello on 2017/9/22.
 */

public class SharedPreferencesUtils {

    /**
     * 存储用信息的sp的xml名字
     */
    public static final String FILE_NAME = "xiaodian";

    /**
     * 用户登录下之后的token
     */
    public static final String TOKEN = "token";

    /**
     * 用于判断是否为认证的服务商
     */
    public static final String PARTNER_TYPE = "partner_type";

    /**
     * 是否为第一次登陆
     */
    public static final String FIRST_ENTER = "first_enter";

    /**
     * 是否为认证的店主
     */
    public static final String VERIFY_STATUS = "verify_status";

    /**
     * 获得token
     *
     * @return
     */
    public static String getToken() {

        return getStringData(TOKEN, null);
    }

    public static void saveToken(String string) {

        saveStringData(TOKEN, string);
    }
    
    public static Application application;
    
    public static void setContext(Application context){
        
        application=context;
    }


    /**
     * 用于判断是否为第一次登陆
     *
     * @return
     */
    public static boolean isFirstLogin() {

        return "0".equals(getStringData(FIRST_ENTER, ""));
    }

    /**
     * 用于判断是否服务商认证
     *
     * @return
     */
    public static String getPartnerType() {

        return getStringData(PARTNER_TYPE, "");
    }

    /**
     * 用于判断是否为店主认证
     *
     * @return
     */
    public static String getVerifyStatus() {

        return getStringData(VERIFY_STATUS, "");
    }


    /**
     * 保存数据到文件
     *
     * @param key
     * @param data
     */
    public static void saveStringData(String key, String data) {

        SharedPreferences.Editor editor = getEditor();
        editor.putString(key, data);
        editor.apply();
    }


    /**
     * 保存数据到文件
     *
     * @param key
     * @param data
     */
    public static void saveBooleanData(String key, boolean data) {

        SharedPreferences.Editor editor = getEditor();
        editor.putBoolean(key, data);
        editor.apply();
    }


    private static SharedPreferences.Editor getEditor() {
        return application
                .getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE)
                .edit();
    }

    private static SharedPreferences getSharePreference() {
        return application
                .getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
    }


    /**
     * 从文件中读取数据
     *
     * @param key
     * @return
     */
    public static String getStringData(String key, String ss) {

        return getSharePreference().getString(key, ss);
    }

    /**
     * 从文件中读取数据
     *
     * @param key
     * @return
     */
    public static boolean getBooleanData(String key) {

        return getSharePreference().getBoolean(key, false);
    }


    /**
     * 通过key删除对应数据
     *
     * @param key
     */
    public static void remove(Context context,String key) {
        SharedPreferences preference = context.getSharedPreferences(key, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preference.edit();
        editor.remove(key);
        editor.apply();
    }

    /**
     * 通过名字清除对应的share所有信息
     *
     * @param fileName
     */
    public static void clean(String fileName) {

        SharedPreferences preference = application.getSharedPreferences(fileName, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preference.edit();
        editor.clear();
        editor.apply();
    }


}
