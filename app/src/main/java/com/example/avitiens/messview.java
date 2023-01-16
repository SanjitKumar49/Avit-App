package com.example.avitiens;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;
import java.io.IOException;

public class messview extends AppCompatActivity {
    private StorageReference sf;
    private TextView textView18,textView19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messview);
        textView18 = findViewById(R.id.textView18);
        textView19= findViewById(R.id.textView19);

        String str=getIntent().getStringExtra("text");
        // north
        // for monday
        if (str.equals("break")) textView18.setText("BREAD,BUTTER,TEA,JAM,MASALA DOSA,CHUTNEY,SAMBHAR");
        else if (str.equals("lunch")) textView18.setText("CHAPPATI,MOONG DAL,RICE SABJI, CURD PAPAD,PICKEL");
        else if (str.equals("snack")) textView18.setText("PASTA,TEA");
        else if (str.equals("dinner")) textView18.setText("CHAPPATI PANEER MASALA,RICH,SABJI,MILK,BANANA");
        // for tuesday
        if (str.equals("break2")) textView18.setText("IDLY,CHUTNEY,SAMBAR,COFFEE");
        else if (str.equals("lunch2")) textView18.setText("CHAPPATI,CHANA DAL,RICE,SABJI,CURD PICKEL,VEG SALAD");
        else if (str.equals("snack2")) textView18.setText("CUTLET,TEA");
        else if (str.equals("dinner2")) textView18.setText("CHAPPATI,CHANA,MASALA,JEERA RICE,PICKEL,MILK,CUTTING FRUIT");
        //south
        // for monday
        if (str.equals("break11")) textView18.setText("BREAD,BUTTER,TEA,JAM,MASALA DOSA,CHUTNEY,SAMBHAR");
        else if (str.equals("lunch11")) textView18.setText("RICE,SAMBAR,RASAM,CURD,PICKEL,PORIEL,PAPPAD");
        else if (str.equals("snack11")) textView18.setText("SUNDAL,TEA");
        else if (str.equals("dinner11")) textView18.setText("LEMON,RICE,PAROTA,PANEER MASALA,THOVAYAL,MILK,BANANA");
        // for tuesday
        if (str.equals("break22")) textView18.setText("IDLY,CHUTNEY,SAMBAR,COFFEE");
        else if (str.equals("lunch22")) textView18.setText("RICE,KARAKOLAMBU,RASAM,CURD,PICKEL,PORIEL,PAPPAD,VEG SALAD");
        else if (str.equals("snack22")) textView18.setText("CUTLET,TEA");
        else if (str.equals("dinner22")) textView18.setText("DOSA,CHUTNEY,SAMBAR,WHITE RICE,RASSAM,PAPPD MILK,CUTTING FRUIT");




    }
}