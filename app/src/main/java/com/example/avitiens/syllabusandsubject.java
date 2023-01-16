package com.example.avitiens;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.storage.StorageReference;

        public class syllabusandsubject extends AppCompatActivity {
            private StorageReference sf;
            private ImageView imageView9, imageView10;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_syllabusandsubject);
                imageView9 = findViewById(R.id.imageView11);
                imageView10 = findViewById(R.id.imageView12);
                String str = getIntent().getStringExtra("comman");
            if (str.equals("csed")) {
                imageView9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String getUrl ="https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/CSE%2FCSE%20Dipt.pdf?alt=media&token=95f6f520-5859-4eb1-aaba-8861a1ac9d00";
                        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(getUrl));
                        String title = URLUtil.guessFileName(getUrl, null, null);
                        request.setTitle(title);
                        request.setDescription("Download start...");
                        String cookie = CookieManager.getInstance().getCookie(getUrl);
                        request.addRequestHeader("cookie", cookie);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, title);
                        DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                        downloadManager.enqueue(request);
                        Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...", Toast.LENGTH_SHORT).show();
                    }
                });
                imageView10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(syllabusandsubject.this, "yes", Toast.LENGTH_SHORT).show();
                        String getUrl = "https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/CSE%2FCSE%20SYLLABUS-3.pdf?alt=media&token=879ad619-3e50-45cc-8893-2ca94faf032b";
                        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(getUrl));
                        String title = URLUtil.guessFileName(getUrl, null, null);
                        request.setTitle(title);
                        request.setDescription("Download start...");
                        String cookie = CookieManager.getInstance().getCookie(getUrl);
                        request.addRequestHeader("cookie", cookie);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, title);
                        DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                        downloadManager.enqueue(request);
                        Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...", Toast.LENGTH_SHORT).show();
                    }
                });

            }
            else if (str.equals("biotechd")){
                imageView9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String getUrl ="https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/BIO-TECH%2FBio-Tech%20Dip.pdf?alt=media&token=b8b0ea49-bab6-4ecf-8e0a-26fbe9b787e6";
                        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(getUrl));
                        String title = URLUtil.guessFileName(getUrl, null, null);
                        request.setTitle(title);
                        request.setDescription("Download start...");
                        String cookie = CookieManager.getInstance().getCookie(getUrl);
                        request.addRequestHeader("cookie", cookie);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, title);
                        DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                        downloadManager.enqueue(request);
                        Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...", Toast.LENGTH_SHORT).show();
                    }
                });
                imageView10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(syllabusandsubject.this, "wait some time", Toast.LENGTH_SHORT).show();
//                        Toast.makeText(syllabusandsubject.this, "yes", Toast.LENGTH_SHORT).show();
//                        String getUrl = "https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/CSE%2FCSE%20SYLLABUS-3.pdf?alt=media&token=879ad619-3e50-45cc-8893-2ca94faf032b";
//                        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(getUrl));
//                        String title = URLUtil.guessFileName(getUrl, null, null);
//                        request.setTitle(title);
//                        request.setDescription("Download start...");
//                        String cookie = CookieManager.getInstance().getCookie(getUrl);
//                        request.addRequestHeader("cookie", cookie);
//                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, title);
//                        DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
//                        downloadManager.enqueue(request);
//                        Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...", Toast.LENGTH_SHORT).show();
                    }
                });

            }
            else if (str.equals("mechd")){
                imageView9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String getUrl ="https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/MECH%2FMech%20Dipt.pdf?alt=media&token=86ed566e-b67b-4bb8-9fb9-4809c60f9dfb";
                        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(getUrl));
                        String title = URLUtil.guessFileName(getUrl, null, null);
                        request.setTitle(title);
                        request.setDescription("Download start...");
                        String cookie = CookieManager.getInstance().getCookie(getUrl);
                        request.addRequestHeader("cookie", cookie);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, title);
                        DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                        downloadManager.enqueue(request);
                        Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...", Toast.LENGTH_SHORT).show();
                    }
                });
                imageView10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(syllabusandsubject.this, "wait some time", Toast.LENGTH_SHORT).show();
//                        Toast.makeText(syllabusandsubject.this, "yes", Toast.LENGTH_SHORT).show();
//                        String getUrl = "https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/CSE%2FCSE%20SYLLABUS-3.pdf?alt=media&token=879ad619-3e50-45cc-8893-2ca94faf032b";
//                        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(getUrl));
//                        String title = URLUtil.guessFileName(getUrl, null, null);
//                        request.setTitle(title);
//                        request.setDescription("Download start...");
//                        String cookie = CookieManager.getInstance().getCookie(getUrl);
//                        request.addRequestHeader("cookie", cookie);
//                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, title);
//                        DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
//                        downloadManager.enqueue(request);
//                        Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...", Toast.LENGTH_SHORT).show();
                    }
                });
            }
    }
}
