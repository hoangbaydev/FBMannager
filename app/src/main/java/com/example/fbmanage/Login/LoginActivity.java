package com.example.fbmanage.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.fbmanage.R;
import com.example.fbmanage.BottomTabsNavigation;

public class LoginActivity extends AppCompatActivity {

    private ImageView btn_login_fb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );
        btn_login_fb=findViewById(R.id.btn_login_fb );
    }
    public void onRegisterClick(View view) {
        startActivity( new Intent(this, BottomTabsNavigation.class) );
    }
}