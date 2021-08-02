package com.androidninja.myintent.datatransfer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import com.androidninja.myintent.R;
import com.androidninja.myintent.explicit.LaunchedActivity;

public class DataTransferFromMainActivity extends AppCompatActivity {

    AppCompatEditText sendMessgaeEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_from);

        sendMessgaeEditText = findViewById(R.id.sendMessgaeEditText);
    }



    public void sendMessage(View view) {
       Intent intent = new Intent(getApplicationContext(),DataTransferToActivity.class);
       intent.putExtra("sendMessageEditText",sendMessgaeEditText.getText().toString());
       startActivity(intent);
    }
}