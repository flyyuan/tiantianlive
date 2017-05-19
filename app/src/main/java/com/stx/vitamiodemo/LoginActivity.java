package com.stx.vitamiodemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {
    @BindView(R.id.btn_login) Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void btn_login(View view){
        startActivity( new Intent(LoginActivity.this,MainActivity.class));
        LoginActivity.this.finish();
    }
}
