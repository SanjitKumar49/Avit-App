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
import android.widget.Toast;

public class csesem extends AppCompatActivity {

    private ImageView sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);
        sem1=findViewById(R.id.sem1);
        sem2=findViewById(R.id.sem2);
        sem3=findViewById(R.id.sem3);
        sem4=findViewById(R.id.sem4);
        sem5=findViewById(R.id.sem5);
        sem6=findViewById(R.id.sem6);
        sem7=findViewById(R.id.sem7);
        sem8=findViewById(R.id.sem8);


        String str = getIntent().getStringExtra("comman");
        {
            if (str.equals("csedp")){
                sem1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(csesem.this, "wait some time", Toast.LENGTH_SHORT).show();
                    }
                });
                sem2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(csesem.this, "wait some time", Toast.LENGTH_SHORT).show();

                    }
                });
                sem3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(csesem.this,notesandquestion.class);
                        intent.putExtra("allcse","threesem");
                        startActivity(intent);
                    }
                });
                sem4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(csesem.this,notesandquestion.class);
                        intent.putExtra("allcse","foursem");
                        startActivity(intent);
                    }
                });
                sem5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(csesem.this,notesandquestion.class);
                        intent.putExtra("allcse","fivesem");
                        startActivity(intent);
                    }
                });
                sem6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(csesem.this,notesandquestion.class);
                        intent.putExtra("allcse","sixsem");
                        startActivity(intent);
                    }
                });

                sem7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(csesem.this,notesandquestion.class);
                        intent.putExtra("allcse","sevensem");
                        startActivity(intent);
                    }
                });
                sem8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(csesem.this,notesandquestion.class);
                        intent.putExtra("allcse","eightsem");
                        startActivity(intent);
                    }
                });
            }
            else if (str.equals("eeed")){
                sem1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(csesem.this, "wait some time", Toast.LENGTH_SHORT).show();
                    }
                });
                sem2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(csesem.this, "wait some time", Toast.LENGTH_SHORT).show();

                    }
                });
           sem3.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("alleee","threesem");
                   startActivity(intent);
               }
           });
           sem4.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("alleee","foursem");
                   startActivity(intent);
               }
           });
           sem5.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("alleee","fivesem");
                   startActivity(intent);
               }
           });
           sem6.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("alleee","sixsem");
                   startActivity(intent);
               }
           });
           sem7.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("alleee","sevensem");
                   startActivity(intent);
               }
           });
           sem8.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("alleee","eightsem");
                   startActivity(intent);
               }
           });
       }
            else if (str.equals("eced")){
                sem1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(csesem.this, "wait some time", Toast.LENGTH_SHORT).show();
                    }
                });
                sem2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(csesem.this, "wait some time", Toast.LENGTH_SHORT).show();

                    }
                });
           sem3.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allece","threesem");
                   startActivity(intent);
               }
           });
           sem4.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allece","foursem");
                   startActivity(intent);
               }
           });
           sem5.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allece","fivesem");
                   startActivity(intent);
               }
           });
           sem6.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allece","sixsem");
                   startActivity(intent);
               }
           });

           sem7.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allece","sevensem");
                   startActivity(intent);
               }
           });
           sem8.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allece","eightsem");
                   startActivity(intent);
               }
           });
       }
             else if (str.equals("aid")){
                sem1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(csesem.this, "wait some time", Toast.LENGTH_SHORT).show();
                    }
                });
                sem2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(csesem.this, "wait some time", Toast.LENGTH_SHORT).show();

                    }
                });
           sem3.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allai","threesem");
                   startActivity(intent);
               }
           });
           sem4.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allai","foursem");
                   startActivity(intent);
               }
           });
           sem5.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allai","fivesem");
                   startActivity(intent);
               }
           });
           sem6.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allai","sixsem");
                   startActivity(intent);
               }
           });

           sem7.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allai","sevensem");
                   startActivity(intent);
               }
           });
           sem8.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allai","eightsem");
                   startActivity(intent);
               }
           });
       }
             else if (str.equals("csd")){
           sem3.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allcs","threesem");
                   startActivity(intent);
               }
           });
           sem4.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allcs","foursem");
                   startActivity(intent);
               }
           });
           sem5.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allcs","fivesem");
                   startActivity(intent);
               }
           });
           sem6.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allcs","sixsem");
                   startActivity(intent);
               }
           });

           sem7.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allcs","sevensem");
                   startActivity(intent);
               }
           });
           sem8.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allcs","eightsem");
                   startActivity(intent);
               }
           });
       }
             else if (str.equals("bmed")){
           sem3.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allbme","threesem");
                   startActivity(intent);
               }
           });
           sem4.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allbme","foursem");
                   startActivity(intent);
               }
           });
           sem5.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allbme","fivesem");
                   startActivity(intent);
               }
           });
           sem6.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allbme","sixsem");
                   startActivity(intent);
               }
           });

           sem7.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allbme","sevensem");
                   startActivity(intent);
               }
           });
           sem8.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allbme","eightsem");
                   startActivity(intent);
               }
           });
       }
             else if (str.equals("pharmad")){
           sem3.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allpharmad","threesem");
                   startActivity(intent);
               }
           });
           sem4.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allpharmad","foursem");
                   startActivity(intent);
               }
           });
           sem5.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allpharmad","fivesem");
                   startActivity(intent);
               }
           });
           sem6.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allpharmad","sixsem");
                   startActivity(intent);
               }
           });

           sem7.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allpharmad","sevensem");
                   startActivity(intent);
               }
           });
           sem8.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allpharmad","eightsem");
                   startActivity(intent);
               }
           });
       }
              else if (str.equals("biotechd")){

           sem3.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allcse","threesem9");
                   startActivity(intent);
               }
           });
           sem4.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   // Intent intent=new Intent(csesem.this,csesubj.class);
                   //intent.putExtra("allcse","foursem9");
                  // startActivity(intent);
                   Toast.makeText(csesem.this, "work in progress", Toast.LENGTH_SHORT).show();
               }
           });
           sem5.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allcse","fivesem9");
                   startActivity(intent);
               }
           });
           sem6.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
//                   Intent intent=new Intent(csesem.this,csesubj.class);
//                   intent.putExtra("allcse","sixsem9");
//                   startActivity(intent);
                   Toast.makeText(csesem.this, "work in progress", Toast.LENGTH_SHORT).show();
               }
           });
           sem7.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allcse","sevensem9");
                   startActivity(intent);
               }
           });
           sem8.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
//                   Intent intent=new Intent(csesem.this,csesubj.class);
//                   intent.putExtra("allcse","eightsem9");
//                   startActivity(intent);
                   Toast.makeText(csesem.this, "work in progress", Toast.LENGTH_SHORT).show();
               }
           });
       }      // odd
              else if (str.equals("mechatronicsd")){
           sem3.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allmechatronics","threesem");
                   startActivity(intent);
               }
           });
           sem4.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allmechatronics","foursem");
                   startActivity(intent);
               }
           });
           sem5.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allmechatronics","fivesem");
                   startActivity(intent);
               }
           });
           sem6.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allmechatronics","sixsem");
                   startActivity(intent);
               }
           });

           sem7.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allmechatronics","sevensem");
                   startActivity(intent);
               }
           });
           sem8.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allmechatronics","eightsem");
                   startActivity(intent);
               }
           });
       }
              else if (str.equals("mechd")){
           sem3.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allmech","threesem");
                   startActivity(intent);
               }
           });
           sem4.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allmech","foursem");
                   startActivity(intent);
               }
           });
           sem5.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allmech","fivesem");
                   startActivity(intent);
               }
           });
           sem6.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allmech","sixsem");
                   startActivity(intent);
               }
           });

           sem7.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allmech","sevensem");
                   startActivity(intent);
               }
           });
           sem8.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allmech","eightsem");
                   startActivity(intent);
               }
           });
        }
              else if (str.equals("civild")){
           sem3.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allcivil","threesem");
                   startActivity(intent);
               }
           });
           sem4.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allcivil","foursem");
                   startActivity(intent);
               }
           });
           sem5.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allcivil","fivesem");
                   startActivity(intent);
               }
           });
           sem6.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allcivil","sixsem");
                   startActivity(intent);
               }
           });

           sem7.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allcivil","sevensem");
                   startActivity(intent);
               }
           });
           sem8.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent=new Intent(csesem.this,csesubj.class);
                   intent.putExtra("allcivil","eightsem");
                   startActivity(intent);
               }
           });
        }

        }
    }
}