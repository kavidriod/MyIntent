package com.androidninja.myintent.appchooser;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.androidninja.myintent.R;
import com.androidninja.myintent.explicit.LaunchedActivity;

public class AppChooserMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appchooser);
    }


    public void sendMessage(View view) {
            Intent sendIntent = new Intent(Intent.ACTION_SEND);
            String text = "AppChooser";

            // Create intent to show the chooser dialog
            Intent chooserIntent = Intent.createChooser(sendIntent,text);

            //Verify the original intent will resolve to at least one activity
        if(chooserIntent.resolveActivity(getPackageManager()) != null)
        {
            startActivity(chooserIntent);
        }

    }
}