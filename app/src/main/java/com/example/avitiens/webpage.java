package com.example.avitiens;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class webpage extends AppCompatActivity {
    private WebView mywebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webpage);
        String str=getIntent().getStringExtra("web");
        mywebView =findViewById(R.id.webview);
        mywebView.setWebViewClient(new WebViewClient());
        final ProgressDialog p=new ProgressDialog(webpage.this);
        p.setTitle("Loading..");
        p.show();
        // my tool bar
        if (str.equals("https://www.mycamu.co.in/#/?action=chooseInstitution")) {
            mywebView.loadUrl("https://www.mycamu.co.in/#/?action=chooseInstitution");
            p.dismiss();
        }
        else if (str.equals("https://www.avit.ac.in/")) {
            mywebView.loadUrl("https://www.avit.ac.in/");
            p.dismiss();
        }
        else if (str.equals("https://vmrfdu.edu.in/")) {
            mywebView.loadUrl("https://vmrfdu.edu.in/");
            p.dismiss();
        }

        WebSettings webSettings = mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
        @Override
        public void onBackPressed(){
            if(mywebView.canGoBack()) {
                mywebView.goBack();
            }
            else{
                super.onBackPressed();
            }
        }


    }
