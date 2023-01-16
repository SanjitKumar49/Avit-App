package com.example.avitiens;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.storage.StorageReference;

public class notesandquestion extends AppCompatActivity {
    private StorageReference sf;
    private ImageView imageView9, imageView10;
    private TextView textView26,textView27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabusandsubject);
        imageView9 = findViewById(R.id.imageView11);
        imageView10 = findViewById(R.id.imageView12);
        textView26=findViewById(R.id.textView26);
        textView27=findViewById(R.id.textView27);
        String str = getIntent().getStringExtra("allcse");
        textView26.setText("Notes");
        textView27.setText("All Question");
          //for notes
            imageView9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (str.equals("threesem")) {
                        Intent intent = new Intent(notesandquestion.this, csesubj.class);
                        intent.putExtra("subject", "threesem");
                        startActivity(intent);
                    }
                    else if (str.equals("foursem")){
                        Intent intent = new Intent(notesandquestion.this, csesubj.class);
                        intent.putExtra("subject", "foursem");
                        startActivity(intent);
                    }
                }
            });
            // for Previous  Year Question Bank
            imageView10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (str.equals("foursem")) {
                        String getUrl = "https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/CSE%2F3rd%20Sem%20Question%20Paper%20%F0%9F%93%84.pdf?alt=media&token=c32ded38-ca81-4cdd-a597-502142608d09";
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
                        Toast.makeText(notesandquestion.this, "Wait Some Time,Your Requirement is processing...", Toast.LENGTH_SHORT).show();
                    }
                }

            });

}
}