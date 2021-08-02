package com.androidninja.myintent.datatransfer;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import com.androidninja.myintent.R;

public class DataTransferToActivity extends AppCompatActivity {

    AppCompatTextView datatv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_to);

        datatv = findViewById(R.id.datatv);

        String sentmessage = savedInstanceState.getString("sendMessageEditText");
        if(sentmessage != null)
        {
            datatv.setText(sentmessage);
        }

    }
}