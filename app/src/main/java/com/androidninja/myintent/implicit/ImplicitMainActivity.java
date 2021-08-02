package com.androidninja.myintent.implicit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.androidninja.myintent.R;
import com.androidninja.myintent.explicit.LaunchedActivity;

public class ImplicitMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_main);
    }


    public void launchImplicitIntent(View view) {
        Intent intent = new Intent();
        intent.setAction("com.sample.intent");
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        startActivity(intent);
    }
}