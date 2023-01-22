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
       // String str = getIntent().getStringExtra("allcse");
        String str = getIntent().getStringExtra("comman");

        textView26.setText("Notes");
        textView27.setText("All Question");
          //for notes
            imageView9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (str.equals("csedp")) {
                        Intent intent = new Intent(notesandquestion.this, csesem.class);
                        intent.putExtra("subject", "cse");
                        startActivity(intent);
                    }
                    else if (str.equals("eeedp")) {
                        Toast.makeText(notesandquestion.this, "Work in Progress...📈!", Toast.LENGTH_SHORT).show();
//                        Intent intent = new Intent(notesandquestion.this, csesem.class);
//                        intent.putExtra("subject", "eee");
//                        startActivity(intent);
                    }
                    else if (str.equals("ecedp")) {
//                        Intent intent = new Intent(notesandquestion.this, csesem.class);
//                        intent.putExtra("subject", "ece");
//                        startActivity(intent);
                        Toast.makeText(notesandquestion.this, "Work in Progress...📈!", Toast.LENGTH_SHORT).show();
                    }
                    else if (str.equals("aidp")) {
//                        Intent intent = new Intent(notesandquestion.this, csesem.class);
//                        intent.putExtra("subject", "ai");
//                        startActivity(intent);
                        Toast.makeText(notesandquestion.this, "Work in Progress...📈!", Toast.LENGTH_SHORT).show();
                    }
                    else if (str.equals("csdp")) {
//                        Intent intent = new Intent(notesandquestion.this, csesem.class);
//                        intent.putExtra("subject", "cs");
//                        startActivity(intent);
                        Toast.makeText(notesandquestion.this, "Work in Progress...📈!", Toast.LENGTH_SHORT).show();
                    }
                    else if (str.equals("bmedp")) {
//                        Intent intent = new Intent(notesandquestion.this, csesem.class);
//                        intent.putExtra("subject", "bme");
//                        startActivity(intent);
                        Toast.makeText(notesandquestion.this, "Work in Progress...📈!", Toast.LENGTH_SHORT).show();
                    }
                    else if (str.equals("pharmadp")) {
//                        Intent intent = new Intent(notesandquestion.this, csesem.class);
//                        intent.putExtra("subject", "pharma");
//                        startActivity(intent);
                        Toast.makeText(notesandquestion.this, "Work in Progress...📈!", Toast.LENGTH_SHORT).show();
                    }
                    else if (str.equals("biotechdp")) {
//                        Intent intent = new Intent(notesandquestion.this, csesem.class);
//                        intent.putExtra("subject", "biotech");
//                        startActivity(intent);
                        Toast.makeText(notesandquestion.this, "Work in Progress...📈!", Toast.LENGTH_SHORT).show();
                    }
                    else if (str.equals("mechatronicsdp")) {
//                        Intent intent = new Intent(notesandquestion.this, csesem.class);
//                        intent.putExtra("subject", "mechatronics");
//                        startActivity(intent);
                        Toast.makeText(notesandquestion.this, "Work in Progress...📈!", Toast.LENGTH_SHORT).show();
                    }
                    else if (str.equals("mechanicaldp")) {
//                        Intent intent = new Intent(notesandquestion.this, csesem.class);
//                        intent.putExtra("subject", "mechanical");
//                        startActivity(intent);
                        Toast.makeText(notesandquestion.this, "Work in Progress...📈!", Toast.LENGTH_SHORT).show();
                    }
                    else if (str.equals("civildp")) {
//                        Intent intent = new Intent(notesandquestion.this, csesem.class);
//                        intent.putExtra("subject", "civil");
//                        startActivity(intent);
                        Toast.makeText(notesandquestion.this, "Work in Progress...📈!", Toast.LENGTH_SHORT).show();
                    }


                }
            });
            // for Previous  Year Question Bank
            imageView10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (str.equals("csedp")) {
                        String getUrl = "https://vmrfdu.edu.in/files/Questions/engg/becse.pdf";
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
                        Toast.makeText(notesandquestion.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                    }
                    else if (str.equals("eeedp")) {
                        String getUrl = "https://vmrfdu.edu.in/files/Questions/engg/beeee.pdf";
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
                        Toast.makeText(notesandquestion.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                    }
                    else if (str.equals("ecedp")) {
                        String getUrl = "https://vmrfdu.edu.in/files/Questions/engg/beece.pdf";
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
                        Toast.makeText(notesandquestion.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                    }
                    else if (str.equals("aidp")) {
                        Toast.makeText(notesandquestion.this, "Data Unavailable", Toast.LENGTH_SHORT).show();
                    }
                    else if (str.equals("csdp")) {
                        Toast.makeText(notesandquestion.this, "Data Unavailable", Toast.LENGTH_SHORT).show();
                    }
                    else if (str.equals("bmedp")) {
                        String getUrl = "https://vmrfdu.edu.in/files/Questions/engg/bebme.pdf";
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
                        Toast.makeText(notesandquestion.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                    }
                    else if (str.equals("pharmadp")) {
                        Toast.makeText(notesandquestion.this, "Data Unavailable", Toast.LENGTH_SHORT).show();
                    }
                    else if (str.equals("biotechdp")) {
                        String getUrl = "https://vmrfdu.edu.in/files/Questions/engg/bebte.pdf";
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
                        Toast.makeText(notesandquestion.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                    }
                    else if (str.equals("mechatronicsdp")) {
                        String getUrl = "https://vmrfdu.edu.in/files/Questions/engg/bemect.pdf";
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
                        Toast.makeText(notesandquestion.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                    }
                    else if (str.equals("mechanicaldp")) {
                        String getUrl = "https://vmrfdu.edu.in/files/Questions/engg/bemech.pdf";
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
                        Toast.makeText(notesandquestion.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                    }
                    else if (str.equals("civildp")) {
                        String getUrl = "https://vmrfdu.edu.in/files/Questions/engg/becivil.pdf";
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
                        Toast.makeText(notesandquestion.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                    }

                }

            });


    }
}