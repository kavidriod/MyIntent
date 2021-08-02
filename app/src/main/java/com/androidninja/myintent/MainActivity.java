package com.androidninja.myintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.androidninja.myintent.appchooser.AppChooserMainActivity;
import com.androidninja.myintent.datatransfer.DataTransferFromMainActivity;
import com.androidninja.myintent.explicit.ExplicitMainActivity;
import com.androidninja.myintent.implicit.ImplicitMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchExplicitIntent(View view) {
        Intent intent = new Intent(getApplicationContext(), ExplicitMainActivity.class);
        startActivity(intent);

    }

    public void launchImplicitIntent(View view) {
        Intent intent = new Intent(getApplicationContext(), ImplicitMainActivity.class);
        startActivity(intent);
    }

    public void forceAnAppChooser(View view) {
        Intent intent = new Intent(getApplicationContext(), AppChooserMainActivity.class);
        startActivity(intent);
    }

    public void dataTransfer(View view) {
        Intent intent = new Intent(getApplicationContext(), DataTransferFromMainActivity.class);
        startActivity(intent);
    }
}