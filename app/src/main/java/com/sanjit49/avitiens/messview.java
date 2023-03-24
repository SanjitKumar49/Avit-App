package com.sanjit49.avitiens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.storage.StorageReference;

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
        else if (str.equals("snack")) textView18.setText("PASTA,COFFEE");
        else if (str.equals("dinner")) textView18.setText("CHAPPATI PANEER MASALA,RICH,SABJI,MILK,BANANA");
        // for tuesday
       else  if (str.equals("break2")) textView18.setText("IDLY,CHUTNEY,SAMBAR,COFFEE");
        else if (str.equals("lunch2")) textView18.setText("CHAPPATI,CHANA DAL,RICE,SABJI,CURD PICKEL,VEG SALAD");
        else if (str.equals("snack2")) textView18.setText("CUTLET,TEA");
        else if (str.equals("dinner2")) textView18.setText("CHAPPATI,CHANA,MASALA,JEERA RICE,PICKEL,MILK,CUTTING FRUIT");

            // for Wednesday
        else  if (str.equals("break3")) textView18.setText("BREAD,BUTTER,JAM,PONGAL,VADAI,CHUTNEY,SAMABR,TEA");
        else if (str.equals("lunch3")) textView18.setText("CHAPPATI,CHICKEN GRAVY,MUSHROOM/PANEER MANCHURIYAN,RICE,RASAM,CURD");
        else if (str.equals("snack3")) textView18.setText("PUFS & COFFEE");
        else if (str.equals("dinner3")) textView18.setText("CHAPPATI,CHANA DHAAL FRY,RICE RASAM,PAYASAM");

            // for Thursday
        else  if (str.equals("break4")) textView18.setText("POORI,MASALA, COFFEE");
        else if (str.equals("lunch4")) textView18.setText("CHAPPATI,ALLO/GOBHI GRAVY,RICE,RASAM,PAPAD,PICKEL,ICE-CREAM,CURD");
        else if (str.equals("snack4")) textView18.setText("JUICE VARIETY");
        else if (str.equals("dinner4")) textView18.setText("ROTI,MUTTER PANEER MASALA,RICE,RASAM,PICKELE,BANANA");

            // for Friday
        else  if (str.equals("break5")) textView18.setText("BREAD,BUTTER,JAM,TEA,RAVA/SEMIYA KITCHADI,CHUTNEY,SAMBAR");
        else if (str.equals("lunch5")) textView18.setText("CHAPPATI,EGG CURRY(2 PIECES),SPECIAL VEG CURRY,RICE,CURD,PAPAD,PICKEL");
        else if (str.equals("snack5")) textView18.setText("VEG & PAKODA & TEA");
        else if (str.equals("dinner5")) textView18.setText("MASALA DOSA,CHUTNEY,SAMBAR,RICE,RASAM,MILK,CUTTING FRUITS");

            // for saturday
        else  if (str.equals("break6")) textView18.setText("ONION,UTHAPPAM,CHTNEY,SAMBAR,COFFEE");
        else if (str.equals("lunch6")) textView18.setText("CHAPPATHI,MOONG-DAAL, RICE,SABJI,CURD,PAPAD,PICKEL,SWEET");
        else if (str.equals("snack6")) textView18.setText("PANIPURI & TEA");
        else if (str.equals("dinner6")) textView18.setText("WHEAT POORI,CHANNA POTATO,KURMA,TOMATO RICE,MILK,BANANA");

            // for sunday
        else  if (str.equals("break7")) textView18.setText("MAGGIE,SAUCE");
        else if (str.equals("lunch7")) textView18.setText("1.WEEK CHICKEN BRIYANI,SWEET");
        else if (str.equals("snack7")) textView18.setText("SAMOSA & TEA");
        else if (str.equals("dinner7")) textView18.setText("CHAPPATI,VEG GRAVY,WHITE RICE,RASAM,MILK");



        //south
        // for monday
        else if (str.equals("break11")) textView18.setText("BREAD,BUTTER,TEA,JAM,MASALA DOSA,CHUTNEY,SAMBHAR");
        else if (str.equals("lunch11")) textView18.setText("RICE,SAMBAR,RASAM,CURD,PICKEL,PORIEL,PAPPAD");
        else if (str.equals("snack11")) textView18.setText("SUNDAL,TEA");
        else if (str.equals("dinner11")) textView18.setText("LEMON,RICE,PAROTA,PANEER MASALA,THOVAYAL,MILK,BANANA");
        // for tuesday
        else if (str.equals("break22")) textView18.setText("IDLY,CHUTNEY,SAMBAR,COFFEE");
        else if (str.equals("lunch22")) textView18.setText("RICE,KARAKOLAMBU,RASAM,CURD,PICKEL,PORIEL,PAPPAD,VEG SALAD");
        else if (str.equals("snack22")) textView18.setText("CUTLET,TEA");
        else if (str.equals("dinner22")) textView18.setText("DOSA,CHUTNEY,SAMBAR,WHITE RICE,RASSAM,PAPPD MILK,CUTTING FRUIT");

            // for Wednesday
        else  if (str.equals("break33")) textView18.setText("BREAD,BUTTER,JAM,PONGAL,VADAI,CHUTNEY,SAMABR,TEA");
        else if (str.equals("lunch33")) textView18.setText("CHAPPATI,CHICKEN GRAVY,MUSHROOM/PANEER MANCHURIYAN,RICE,RASAM,CURD");
        else if (str.equals("snack33")) textView18.setText("PUFS & COFFEE");
        else if (str.equals("dinner33")) textView18.setText("CHAPPATI(OI;),PULAV,CHANNA DHAAL,RICE,RASA,PAYASAM");

            // for Thursday
        else  if (str.equals("break44")) textView18.setText("POORI,MASALA, COFFEE");
        else if (str.equals("lunch44")) textView18.setText("RICE,SAMBAR,RASAM,PICKEL,PORIEL,PAPPAD,ICE-CREAM,CURD");
        else if (str.equals("snack44")) textView18.setText("JUICE VARIETY");
        else if (str.equals("dinner44")) textView18.setText("IDLY,SAMBAR,CHUTNEY,MILK,BANANA");

            // for Friday
        else  if (str.equals("break55")) textView18.setText("BREAD,BUTTER,JAM,TEA,RAVA/SEMIYA KITCHADI,CHUTNEY,SAMBAR");
        else if (str.equals("lunch55")) textView18.setText("CHAPPATI,EGG CURRY(2 PIECES),SPECIAL VEG CURRY,RICE,CURD,PAPAD,PICKEL");
        else if (str.equals("snack55")) textView18.setText("VEG & PAKODA & TEA");
        else if (str.equals("dinner55")) textView18.setText("MASALA DOSA,CHUTNEY,SAMBAR,RICE,RASAM,MILK,CUTTING FRUITS");

            // for saturday
        else  if (str.equals("break66")) textView18.setText("ONION,UTHAPPAM,CHTNEY,SAMBAR,COFFEE");
        else if (str.equals("lunch66")) textView18.setText("RICE MORE,KOLAMBU,RASAM,CURD,PAPAD,PICKEL,SWEET");
        else if (str.equals("snack66")) textView18.setText("PANIPURI & TEA");
        else if (str.equals("dinner66")) textView18.setText("WHEAT POORI,CHANNA POTATO,KURMA,TOMATO RICE,MILK,BANANA");

            // for sunday
        else  if (str.equals("break77")) textView18.setText("MAGGIE,SAUCE");
        else if (str.equals("lunch77")) textView18.setText("1.WEEK CHICKEN BRIYANI,SWEET");
        else if (str.equals("snack77")) textView18.setText("SAMOSA & TEA");
        else if (str.equals("dinner77")) textView18.setText("MINT RICE,CHIPS,RICE,RASAM,MILK");




    }
}