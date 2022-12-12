package com.example.menu;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Uri url = getIntent().getData();
        WebView webView = findViewById(R.id.webView);
        webView.setWebViewClient(new Callback());
        webView.loadUrl(url.toString());
    }

    public void onClick(View view){
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("http://developer.alexanderklimov.ru/android/"));
        startActivity(intent);
    }

    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading
                (WebView view, String url) {
            return(false);
        }
    }
}
