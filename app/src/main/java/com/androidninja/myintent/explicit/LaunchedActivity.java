package com.androidninja.myintent.explicit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.androidninja.myintent.R;

public class LaunchedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launched);
    }
}