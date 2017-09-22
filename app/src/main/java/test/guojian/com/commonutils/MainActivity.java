package test.guojian.com.commonutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import test.guojian.com.androidutils.Installation;
import test.guojian.com.androidutils.MD5Encryption;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {

        String asd = MD5Encryption.MD5(Installation.id(this));

    }
}
