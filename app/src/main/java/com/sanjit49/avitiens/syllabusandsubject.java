package com.sanjit49.avitiens;

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
                        Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                    }
                });

            }
            if (str.equals("eeed")) {
                    imageView9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String getUrl ="https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/EEE%2FEEE%20Department%20(1).pdf?alt=media&token=013545de-e070-48d1-8ea7-6b7a57d49f7c";
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
                            Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                        }
                    });
                    imageView10.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String getUrl = "https://www.avit.ac.in/electrical-electronics-engineering-courses/curriculum-syllabus/R%202017%20-%20EEE.pdf";
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
                            Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                        }
                    });

                }

                if (str.equals("eced")) {
                    imageView9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String getUrl ="https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/ECE%2FECE%20DEPARTMENT.pdf?alt=media&token=664d69be-f89b-4dd9-97d6-5f1cddf78cb9";
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
                            Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                        }
                    });
                    imageView10.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String getUrl = "https://www.avit.ac.in/electronics-communication-engineering-courses/curriculum-syllabus/new/2017.pdf";
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
                            Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                        }
                    });

                }

                if (str.equals("aid")) {
                    imageView9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
//                            String getUrl ="https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/CSE%2FCSE%20Dipt.pdf?alt=media&token=95f6f520-5859-4eb1-aaba-8861a1ac9d00";
//                            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(getUrl));
//                            String title = URLUtil.guessFileName(getUrl, null, null);
//                            request.setTitle(title);
//                            request.setDescription("Download start...");
//                            String cookie = CookieManager.getInstance().getCookie(getUrl);
//                            request.addRequestHeader("cookie", cookie);
//                            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, title);
//                            DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
//                            downloadManager.enqueue(request);
//                            Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...", Toast.LENGTH_SHORT).show();
                            Toast.makeText(syllabusandsubject.this, "Subject Are Not Available..😑", Toast.LENGTH_SHORT).show();

                        }
                    });
                    imageView10.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String getUrl = "https://www.avit.ac.in/computer-science-engineering-courses/syllabus/BE_AI_DS_CS/AI_DS%202017%20REGULATION%20SYLLABUS.pdf";
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
                            Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                        }
                    });

                }

                if (str.equals("csd")) {
                    imageView9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
//                            String getUrl ="https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/CSE%2FCSE%20Dipt.pdf?alt=media&token=95f6f520-5859-4eb1-aaba-8861a1ac9d00";
//                            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(getUrl));
//                            String title = URLUtil.guessFileName(getUrl, null, null);
//                            request.setTitle(title);
//                            request.setDescription("Download start...");
//                            String cookie = CookieManager.getInstance().getCookie(getUrl);
//                            request.addRequestHeader("cookie", cookie);
//                            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, title);
//                            DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
//                            downloadManager.enqueue(request);
//                            Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...", Toast.LENGTH_SHORT).show();
                            Toast.makeText(syllabusandsubject.this, "Subject Are Not Available...😑", Toast.LENGTH_SHORT).show();

                        }
                    });
                    imageView10.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String getUrl = "https://www.avit.ac.in/computer-science-engineering-courses/syllabus/BE_AI_DS_CS/CYBER%20SECURITY%202017%20REGULATION%20SYLLABUS.pdf";
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
                            Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                        }
                    });

                }

                if (str.equals("bmed")) {
                    imageView9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String getUrl ="https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/BME%2FBME%20DEPARTMENT.pdf?alt=media&token=e4552117-ab8f-4004-bfad-0e4bd470ade1";
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
                            Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                        }
                    });
                    imageView10.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String getUrl = "https://www.avit.ac.in/biomedical-engineering-courses/curriculum-syllabus/BE%20BME%20FT%20R2017%20CURRICULUM%20AND%20SYLLABUS%20(CBCS)_pagenumber.pdf";
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
                            Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                        }
                    });

                }

                if (str.equals("pharmad")) {
                    imageView9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
//                            String getUrl ="https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/CSE%2FCSE%20Dipt.pdf?alt=media&token=95f6f520-5859-4eb1-aaba-8861a1ac9d00";
//                            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(getUrl));
//                            String title = URLUtil.guessFileName(getUrl, null, null);
//                            request.setTitle(title);
//                            request.setDescription("Download start...");
//                            String cookie = CookieManager.getInstance().getCookie(getUrl);
//                            request.addRequestHeader("cookie", cookie);
//                            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//                            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, title);
//                            DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
//                            downloadManager.enqueue(request);
//                            Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...", Toast.LENGTH_SHORT).show();
                            Toast.makeText(syllabusandsubject.this, "Subject Are Not Available...😑", Toast.LENGTH_SHORT).show();
                        }
                    });
                    imageView10.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String getUrl = "https://www.avit.ac.in/pharmaceutical-engineering-courses/curriculum-syllabus/Pharma%202017%20and%20syllabus_compressed.pdf";
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
                            Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
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
                        Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                    }
                });
                imageView10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(syllabusandsubject.this, "yes", Toast.LENGTH_SHORT).show();
                        String getUrl = "https://www.avit.ac.in/biotechnology-engineering-courses/curriculum-syllabus/Biotechnology-UG%20-%20R2017%20-%20CURRICULUM%20AND%20SYLLABUS.pdf";
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
                        Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                    }
                });

            }

                if (str.equals("mechatronicsd")) {
                    imageView9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String getUrl ="https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/MECHTRONICS%2FMECHTRONICS%20DEPARTMENT%20(1).pdf?alt=media&token=1748bba7-0519-4625-84e2-b38390822247";
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
                            Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                        }
                    });
                    imageView10.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String getUrl = "https://www.avit.ac.in/electrical-electronics-engineering-courses/curriculum-syllabus/R%202017%20-%20Mechatronics.pdf";
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
                            Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
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
                        Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                    }
                });
                imageView10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(syllabusandsubject.this, "yes", Toast.LENGTH_SHORT).show();
                        String getUrl = "https://www.avit.ac.in/mechanical-engineering-courses/curriculum-syllabus/UG-R2021-MECH%20-%20FT%20-%20CURRICULUM.pdf";
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
                        Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                    }
                });
            }

                if (str.equals("civild")) {
                    imageView9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String getUrl ="https://firebasestorage.googleapis.com/v0/b/avit-college.appspot.com/o/CIVIL%2FCivil%20Department.pdf?alt=media&token=d0a0ef45-26b1-43af-be56-c2a063efd315";
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
                            Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                        }
                    });
                    imageView10.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String getUrl = "https://www.avit.ac.in/civil-engineering-courses/curriculum-syllabus/B.E-Curriculum%20&%20Syllabus%20REGULAR_2017.pdf";
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
                            Toast.makeText(syllabusandsubject.this, "Wait Some Time,Your Requirement is processing...👍", Toast.LENGTH_SHORT).show();
                        }
                    });

                }
    }
}
