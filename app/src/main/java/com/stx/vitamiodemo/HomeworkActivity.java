package com.stx.vitamiodemo;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class HomeworkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if (checkedId==R.id.radio0) {
                    RadioButton radioButton = (RadioButton) findViewById(checkedId);
                    Toast.makeText(getApplicationContext(), "正确：" + radioButton.getText(), Toast.LENGTH_SHORT).show();
                }else {
                    RadioButton radioButton = (RadioButton) findViewById(checkedId);
                    Toast.makeText(getApplicationContext(), "错误：" + radioButton.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
