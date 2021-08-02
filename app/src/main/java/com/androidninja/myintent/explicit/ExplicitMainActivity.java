package com.androidninja.myintent.explicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.androidninja.myintent.R;

public class ExplicitMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_main);
    }

    public void launchExplicitIntent(View view) {
        Intent intent = new Intent(getApplicationContext(),LaunchedActivity.class);
        startActivity(intent);
    }
}