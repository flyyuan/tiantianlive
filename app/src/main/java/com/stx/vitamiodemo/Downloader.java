package com.stx.vitamiodemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Downloader extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_downloader);

    }
    public void pgup(View view){
        Intent intent = new Intent(Downloader.this,MainActivity.class);
        startActivity(intent);
    }
}
