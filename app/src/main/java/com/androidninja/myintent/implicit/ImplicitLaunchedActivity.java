package com.androidninja.myintent.implicit;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.androidninja.myintent.R;

public class ImplicitLaunchedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_launched);
    }
}