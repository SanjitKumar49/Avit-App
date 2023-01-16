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

public class csesubj extends AppCompatActivity {
    private ImageView sem3ajp, sem3cd, sem3eh, sem3ooad, sem3dmm, sem3dmdw;
    private TextView one, two, three, four, five, six;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesubj);

        one = findViewById(R.id.ajpajp);
        two = findViewById(R.id.cdcd);
        three = findViewById(R.id.eheh);
        four = findViewById(R.id.ooadooad);
        five = findViewById(R.id.dmmdmm);
        six = findViewById(R.id.dmdwdmdw);

        sem3ajp = findViewById(R.id.sem5ajp);
        sem3cd = findViewById(R.id.sem5cd);
        sem3eh = findViewById(R.id.sem5eh);
        sem3ooad = findViewById(R.id.sem5ooad);
        sem3dmm = findViewById(R.id.sem5dmm);
        sem3dmdw = findViewById(R.id.sem5dmdw);

        // for CSE dipartment to fetch the picture frome the database
        String str = getIntent().getStringExtra("subject");

      // For CSE Dipartment //
              //3rd sem
        if (str.equals("threesem")) {
            one.setText("OOPS");
            {
                sem3ajp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String getUrl = "https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/CSE%2F3sem%2FOOPS%20Notes.pdf?alt=media&token=51234ae4-32fb-4856-805c-e4d49f46ebd4";
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
                        Toast.makeText(csesubj.this, "Wait Some Time,Your Requirement is processing...", Toast.LENGTH_SHORT).show();
                    }

                });
            }two.setText("DBMS");
            {
                sem3cd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String getUrl = "https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/CSE%2F3sem%2FDBMS%20Notes.pdf?alt=media&token=aedeca79-211f-4ce8-b20a-10fc82de60f4";
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
                        Toast.makeText(csesubj.this, "Wait Some Time,Your Requirement is processing...", Toast.LENGTH_SHORT).show();
                    }
                });

                three.setText("DAA");
                {
                    sem3eh.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String getUrl = "https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/CSE%2F3sem%2FDAA%20NOTES.pdf?alt=media&token=d0eb0e74-e455-4d88-9383-d7c760dc4acd";
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
                            Toast.makeText(csesubj.this, "Wait Some Time,Your Requirement is processing...", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
                four.setText("CA");
                {
                    sem3ooad.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String getUrl = "https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/CSE%2F3sem%2FCA%20Notes.pdf?alt=media&token=295026e4-ae17-4afe-9494-0e0903a2abfb";
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
                            Toast.makeText(csesubj.this, "Wait Some Time,Your Requirement is processing...", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
                five.setText("SE");
                {
                    sem3dmm.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(csesubj.this, "Sorry Data is Unavailable", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
                six.setText("NM&NT");
                {
                    sem3dmdw.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String getUrl = "https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/CSE%2F3sem%2FNM%26NT%20Notes.pdf?alt=media&token=d2a16e6d-9b26-435d-bf3c-b86e5adf76af";
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
                            Toast.makeText(csesubj.this, "Wait Some Time,Your Requirement is processing...", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        }

                // 4th sem
        else if (str.equals("foursem")) {
            one.setText("java");
            {
                sem3ajp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String getUrl = "https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/CSE%2F4sem%2FJava%20Notes.pdf?alt=media&token=8e32f289-d1a4-4581-97af-9443d5ff5929";
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
                        Toast.makeText(csesubj.this, "Wait Some Time,Your Requirement is processing...", Toast.LENGTH_SHORT).show();
                    }
                });
            }
            two.setText("CN");
            {
                sem3cd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String getUrl = "https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/CSE%2F4sem%2FCN%20Notes.pdf?alt=media&token=45fe12e1-a6c6-4cf1-9c43-a8c3219148d7";
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
                        Toast.makeText(csesubj.this, "Wait Some Time,Your Requirement is processing...", Toast.LENGTH_SHORT).show();
                    }
                });

                three.setText("OS");
                {
                    sem3eh.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String getUrl = "https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/CSE%2F4sem%2FOs%20Notes.pdf?alt=media&token=1dd0198c-8f50-41ce-bf6b-0335e2537c3f";
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
                            Toast.makeText(csesubj.this, "Wait Some Time,Your Requirement is processing...", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
                four.setText("PQT");
                {
                    sem3ooad.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String getUrl = "https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/CSE%2F4sem%2FPQT%20NOtes.pdf?alt=media&token=544abab8-e3b9-473a-8bd7-5cb5d328ae99";
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
                            Toast.makeText(csesubj.this, "Wait Some Time,Your Requirement is processing...", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
                five.setText("Egile");
                {
                    sem3dmm.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(csesubj.this, "Data not available", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
                six.setText("EVS");
                {
                    sem3dmdw.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String getUrl = "https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/CSE%2F4sem%2FEVS%20Unit%203%20%26%204.pdf?alt=media&token=83b8b99d-5770-49c3-9a4c-217321033130";
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
                            Toast.makeText(csesubj.this, "Wait Some Time,Your Requirement is processing...", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        }
                 //5th
        else if (str.equals("fivesem")) {
            sem3ajp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(csesubj.this, syllabusandsubject.class);
                    intent.putExtra("datapass", "ajp");
                    startActivity(intent);
                }
            });
            sem3cd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(csesubj.this, syllabusandsubject.class);
                    intent.putExtra("datapass", "IMG_20221230_133036");
                    startActivity(intent);
                }
            });
            sem3eh.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(csesubj.this, syllabusandsubject.class);
                    intent.putExtra("datapass", "IMG_20221230_132933");
                    startActivity(intent);
                }
            });
            sem3ooad.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(csesubj.this, syllabusandsubject.class);
                    intent.putExtra("datapass", "IMG_20221230_133003");
                    startActivity(intent);
                }
            });
            sem3dmm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(csesubj.this, syllabusandsubject.class);
                    intent.putExtra("datapass", "IMG_20221230_102847");
                    startActivity(intent);
                }
            });
            sem3dmdw.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(csesubj.this, syllabusandsubject.class);
                    intent.putExtra("datapass", "IMG_20221230_131358");
                    startActivity(intent);
                }
            });

        }
                 //6sem
        else if (str.equals("sixsem")) {
            one.setText("java");
            {
                sem3ajp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(csesubj.this, syllabusandsubject.class);
                        intent.putExtra("datapass", "IMG_20221230_162305");
                        startActivity(intent);
                    }
                });
            }
            two.setText("CN");
            {
                sem3cd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(csesubj.this, syllabusandsubject.class);
                        intent.putExtra("datapass", "IMG_20221230_162245");
                        startActivity(intent);
                    }
                });

                three.setText("OS");
                {
                    sem3eh.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(csesubj.this, syllabusandsubject.class);
                            intent.putExtra("datapass", "IMG_20221230_162217");
                            startActivity(intent);
                        }
                    });
                }
                four.setText("PQT");
                {
                    sem3ooad.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(csesubj.this, syllabusandsubject.class);
                            intent.putExtra("datapass", "IMG_20221230_162016");
                            startActivity(intent);
                        }
                    });
                }
                five.setText("Egile");
                {
                    sem3dmm.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(csesubj.this, syllabusandsubject.class);
                            intent.putExtra("datapass", "IMG_20221230_162501");
                            startActivity(intent);
                        }
                    });
                }
                six.setText("EVS");
                {
                    sem3dmdw.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(csesubj.this, syllabusandsubject.class);
                            intent.putExtra("datapass", "IMG_20221230_162047");
                            startActivity(intent);
                        }
                    });
                }
            }
        }
               //7sem
        else if (str.equals("sevensem")){
            one.setText("RIA");
            {
                sem3ajp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(csesubj.this, syllabusandsubject.class);
                        intent.putExtra("datapass", "IMG_20221231_004430");
                        startActivity(intent);
                    }
                });
            }
            two.setText("CC");
            {
                sem3cd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(csesubj.this, syllabusandsubject.class);
                        intent.putExtra("datapass", "IMG_20221231_004401");
                        startActivity(intent);
                    }
                });

                three.setText("BI&A");
                {
                    sem3eh.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(csesubj.this, syllabusandsubject.class);
                            intent.putExtra("datapass", "IMG_20221231_004335");
                            startActivity(intent);
                        }
                    });
                }
                four.setText("AP");
                {
                    sem3ooad.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(csesubj.this, "Syllabus  not available ", Toast.LENGTH_SHORT).show();

                           // Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                            //intent.putExtra("datapass", "Firebase_DB_SnohTech");
                           // startActivity(intent);
                        }
                    });
                }
                five.setText("SC");
                {
                    sem3dmm.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(csesubj.this, "Syllabus is not available ", Toast.LENGTH_SHORT).show();
                      Intent intent = new Intent(csesubj.this, syllabusandsubject.class);
                       intent.putExtra("datapass", "IMG_20221230_162501");
                       startActivity(intent);
                        }
                    });
                }
                six.setText("NULL");
                {
                    sem3dmdw.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(csesubj.this, "Subject Over.", Toast.LENGTH_SHORT).show();
                           //Intent intent = new Intent(csesubj.this, csesubjpicture.class);
                     // intent.putExtra("datapass", "IMG_20221230_162047");
                     //  startActivity(intent);
                        }
                    });
                }
            }
        }
               //8sem
        else if (str.equals("eightsem")) {
            one.setText("java");
            {
                sem3ajp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(csesubj.this, syllabusandsubject.class);
                        intent.putExtra("datapass", "IMG_20221230_162305");
                        startActivity(intent);
                    }
                });
            }
            two.setText("CN");
            {
                sem3cd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(csesubj.this, syllabusandsubject.class);
                        intent.putExtra("datapass", "IMG_20221230_162245");
                        startActivity(intent);
                    }
                });

                three.setText("OS");
                {
                    sem3eh.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(csesubj.this, syllabusandsubject.class);
                            intent.putExtra("datapass", "IMG_20221230_162217");
                            startActivity(intent);
                        }
                    });
                }
                four.setText("PQT");
                {
                    sem3ooad.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(csesubj.this, syllabusandsubject.class);
                            intent.putExtra("datapass", "IMG_20221230_162016");
                            startActivity(intent);
                        }
                    });
                }
                five.setText("Egile");
                {
                    sem3dmm.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(csesubj.this, syllabusandsubject.class);
                            intent.putExtra("datapass", "IMG_20221230_162501");
                            startActivity(intent);
                        }
                    });
                }
                six.setText("EVS");
                {
                    sem3dmdw.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(csesubj.this, syllabusandsubject.class);
                            intent.putExtra("datapass", "IMG_20221230_162047");
                            startActivity(intent);
                        }
                    });
                }
            }
        }



    }
}
