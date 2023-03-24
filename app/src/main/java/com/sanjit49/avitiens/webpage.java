package com.sanjit49.avitiens;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;

public class webpage extends AppCompatActivity {
    private WebView mywebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webpage);
        String str=getIntent().getStringExtra("web");
        mywebView =findViewById(R.id.webview);
        mywebView.setWebViewClient(new WebViewClient());
        // my tool bar
        if (str.equals("https://www.mycamu.co.in/#/?action=chooseInstitution")) {
            mywebView.loadUrl("https://www.mycamu.co.in/#/?action=chooseInstitution");
        }
        else if (str.equals("https://www.avit.ac.in/")) {
            mywebView.loadUrl("https://www.avit.ac.in/");
        }
        else if (str.equals("https://vmrfdu.edu.in/")) {
            mywebView.loadUrl("https://vmrfdu.edu.in/");
        }
        else if (str.equals("https://www.google.com/maps/place/AARUPADAI+VEEDU+INSTITUTE+OF+TECHNOLOGY/@12.65669,80.1801109,15z/data=!4m5!3m4!1s0x0:0xbf0f1882c4b4ceb1!8m2!3d12.65669!4d80.1801109")) {
            mywebView.loadUrl("https://www.google.com/maps/place/AARUPADAI+VEEDU+INSTITUTE+OF+TECHNOLOGY/@12.65669,80.1801109,15z/data=!4m5!3m4!1s0x0:0xbf0f1882c4b4ceb1!8m2!3d12.65669!4d80.1801109");
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

//    final ProgressDialog p=new ProgressDialog(MainActivity.this);
//        p.setTitle("Loading..");
//        p.show();
    //p.dimiss();
    }
