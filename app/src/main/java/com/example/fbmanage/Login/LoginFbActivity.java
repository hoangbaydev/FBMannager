package com.example.fbmanage.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.WebView;

import com.example.fbmanage.R;

public class LoginFbActivity<val> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login_fb );
        WebView mywebview = (WebView) findViewById(R.id.web_view);
        mywebview.loadUrl("https://www.facebook.com/pages/?category=your_pages&ref=bookmarks");



        mywebview.loadUrl("https://www.facebook.com/x`");



    }
}