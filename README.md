### Android常用工具类

[![](https://jitpack.io/v/ALguojian/CommonUtils.svg)](https://jitpack.io/#ALguojian/CommonUtils)

1.Add it in your root build.gradle at the end of repositories:
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

2.Add the dependency
```
	dependencies {
	        compile 'com.github.ALguojian:CommonUtils:v1.0'
	}

```

> AppManager
>> activity管理类

> CodeUtils
>> 生成随机验证码

> DataFormat
>> 时间转化类

> EmojiUtils
>> 判断是否包含emoji表情

> EyesUtils
>> 显示密码和隐藏密码

> GetVersion
>> 获得版本号和版本名字

> HtmlUtils
>> 判断html长度

> Installation
>> 获得唯一标识ID和随机的UUID以及应用包名

> JudgePhone
>> 判断是否是手机号

> MD5Encryption
>> MD5加密工具类

> MyLinearLayoutManager
>> recyclerVIew 自定义linearLayoutManger，用于嵌套scrollview等

> NoDoubleClickUtils
>> 防止用户多次点击同一个按钮造成多余操作

> RecycleViewDivider
>> RecyclerView自定义分割线

> SHAEncryption
>> SHA加密

> StatusBarUtils
>> 修改状态栏字体颜色兼容魅族和小米

> GetReallyUri
>> 获得android7.0真实的uri

> KeyBoardUtils
>> 打开或关闭软键盘

> ScreenBrightnessUtils
>> 屏幕亮度控制工具类

> SharedPreferencesUtils
>> SharedPreference工具类

> TabUtils
>> 设置TabLayout指示器宽度
```
tab_view.post(new Runnable() {
    @Override
    public void run() {
        TabUtils.setIndicator(tab_view,10,10);
    }
});
```
