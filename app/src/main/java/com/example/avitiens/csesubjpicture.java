package com.example.avitiens;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class csesubjpicture extends AppCompatActivity {
    private StorageReference sf;
    private ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesubjpicture);
        imageView2 = findViewById(R.id.imageView2);
        final ProgressDialog p=new ProgressDialog(csesubjpicture.this);
        p.setTitle("Loading..");
        p.show();;
        String str = getIntent().getStringExtra("5sem");
        {
            if (str.equals("ajp")) {
                sf = FirebaseStorage.getInstance().getReference().child("cse/ajp.jpg");
                try {
                    final File localfile = File.createTempFile("ajp", "jpg");
                    sf.getFile(localfile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Bitmap b = BitmapFactory.decodeFile(localfile.getAbsolutePath());
                            imageView2.setImageBitmap(b);
                            p.dismiss();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(csesubjpicture.this, "Please Try Again..!", Toast.LENGTH_SHORT).show();
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (str.equals("IMG_20221230_133036")) {
                sf = FirebaseStorage.getInstance().getReference().child("cse/IMG_20221230_133036.jpg");
                try {
                    final File l = File.createTempFile("IMG_20221230_133036", "jpg");

                    sf.getFile(l).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Bitmap b = BitmapFactory.decodeFile(l.getAbsolutePath());
                            imageView2.setImageBitmap(b);
                            p.dismiss();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(csesubjpicture.this, "Please Try Again..!", Toast.LENGTH_SHORT).show();
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (str.equals("IMG_20221230_132933")) {
                sf = FirebaseStorage.getInstance().getReference().child("cse/IMG_20221230_132933.jpg");
                try {
                    final File l = File.createTempFile("IMG_20221230_132933", "jpg");

                    sf.getFile(l).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Bitmap b = BitmapFactory.decodeFile(l.getAbsolutePath());
                            imageView2.setImageBitmap(b);
                            p.dismiss();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(csesubjpicture.this, "Please Try Again..!", Toast.LENGTH_SHORT).show();
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (str.equals("IMG_20221230_133003")) {
                sf = FirebaseStorage.getInstance().getReference().child("cse/IMG_20221230_133003.jpg");
                try {
                    final File l = File.createTempFile("IMG_20221230_133003", "jpg");
                    sf.getFile(l).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Bitmap b = BitmapFactory.decodeFile(l.getAbsolutePath());
                            imageView2.setImageBitmap(b);
                            p.dismiss();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(csesubjpicture.this, "Please Try Again..!", Toast.LENGTH_SHORT).show();
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (str.equals("IMG_20221230_102847")) {
                sf = FirebaseStorage.getInstance().getReference().child("cse/IMG_20221230_102847.jpg");
                try {
                    final File l = File.createTempFile("IMG_20221230_102847", "jpg");
                    sf.getFile(l).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Bitmap b = BitmapFactory.decodeFile(l.getAbsolutePath());
                            imageView2.setImageBitmap(b);
                            p.dismiss();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(csesubjpicture.this, "Please Try Again..!", Toast.LENGTH_SHORT).show();
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (str.equals("IMG_20221230_131358")) {
                sf = FirebaseStorage.getInstance().getReference().child("cse/IMG_20221230_131358.jpg");
                try {
                    final File l = File.createTempFile("IMG_20221230_131358", "jpg");
                    sf.getFile(l).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Bitmap b = BitmapFactory.decodeFile(l.getAbsolutePath());
                            imageView2.setImageBitmap(b);
                            p.dismiss();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(csesubjpicture.this, "Please Try Again..!", Toast.LENGTH_SHORT).show();
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (str.equals("IMG_20221230_162305")) {
                sf = FirebaseStorage.getInstance().getReference().child("cse/IMG_20221230_162305.jpg");
                try {
                    final File localfile = File.createTempFile("IMG_20221230_162305", "jpg");
                    sf.getFile(localfile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Bitmap b = BitmapFactory.decodeFile(localfile.getAbsolutePath());
                            imageView2.setImageBitmap(b);
                            p.dismiss();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(csesubjpicture.this, "Please Try Again..!", Toast.LENGTH_SHORT).show();
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (str.equals("IMG_20221230_162245")) {
                sf = FirebaseStorage.getInstance().getReference().child("cse/IMG_20221230_162245.jpg");
                try {
                    final File localfile = File.createTempFile("IMG_20221230_162245", "jpg");
                    sf.getFile(localfile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Bitmap b = BitmapFactory.decodeFile(localfile.getAbsolutePath());
                            imageView2.setImageBitmap(b);
                            p.dismiss();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(csesubjpicture.this, "Please Try Again..!", Toast.LENGTH_SHORT).show();
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if (str.equals("IMG_20221230_162217")) {
                sf = FirebaseStorage.getInstance().getReference().child("cse/IMG_20221230_162217.jpg");
                try {
                    final File localfile = File.createTempFile("IMG_20221230_162217", "jpg");
                    sf.getFile(localfile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Bitmap b = BitmapFactory.decodeFile(localfile.getAbsolutePath());
                            imageView2.setImageBitmap(b);
                            p.dismiss();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(csesubjpicture.this, "Please Try Again..!", Toast.LENGTH_SHORT).show();
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if (str.equals("IMG_20221230_162016")) {
                sf = FirebaseStorage.getInstance().getReference().child("cse/IMG_20221230_162016.jpg");
                try {
                    final File localfile = File.createTempFile("IMG_20221230_162016", "jpg");
                    sf.getFile(localfile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Bitmap b = BitmapFactory.decodeFile(localfile.getAbsolutePath());
                            imageView2.setImageBitmap(b);
                            p.dismiss();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(csesubjpicture.this, "Please Try Again..!", Toast.LENGTH_SHORT).show();

                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if (str.equals("IMG_20221230_162501")) {
                sf = FirebaseStorage.getInstance().getReference().child("cse/IMG_20221230_162501.jpg");
                try {
                    final File localfile = File.createTempFile("IMG_20221230_162501", "jpg");
                    sf.getFile(localfile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Bitmap b = BitmapFactory.decodeFile(localfile.getAbsolutePath());
                            imageView2.setImageBitmap(b);
                            p.dismiss();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(csesubjpicture.this, "Please Try Again..!", Toast.LENGTH_SHORT).show();
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if (str.equals("IMG_20221230_162047")) {
                sf = FirebaseStorage.getInstance().getReference().child("cse/IMG_20221230_162047.jpg");
                try {
                    final File localfile = File.createTempFile("IMG_20221230_162047", "jpg");
                    sf.getFile(localfile).addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Bitmap b = BitmapFactory.decodeFile(localfile.getAbsolutePath());
                            imageView2.setImageBitmap(b);
                            p.dismiss();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(csesubjpicture.this, "Please Try Again..!", Toast.LENGTH_SHORT).show();
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
