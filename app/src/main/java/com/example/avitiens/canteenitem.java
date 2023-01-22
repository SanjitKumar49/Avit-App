package com.example.avitiens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class canteenitem extends AppCompatActivity {
  private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteenitem);
        list=findViewById(R.id.list);
     String str= getIntent().getStringExtra("item");
     if (str.equals("first")) {
         String item[] = {"SAMOSA[2NOS]-RS.20.00","BHEL-POORI -RS.25.00","PANI-POORI -RS.25.00","SEV-POORI -RS.30.00","DAHI-POORI -RS.30.00","CHENNA-MASALA -RS.35.00","APPLE-JUICE -RS.65.00"
                 ,"PINEAPPLE-JUICE -RS.55.00","GRAPE-JUICE -RS.55.00","POMEGRANATE -RS.65.00","MANGO-JUICE -RS.65.00","SWEET-LIME -RS.45.00",
                 "FRESH-LIME -RS.25.00","ORANGE -RS.80.00","WATER-MELON -RS.45.00","TEA & COFFEE -RS.15.00"};
         ArrayAdapter<String> adapter = new ArrayAdapter<>(canteenitem.this, android.R.layout.simple_list_item_1, item);
         list.setAdapter(adapter);
     }
       else if (str.equals("second")) {
            String item[] = {"VEG.NOODLES -RS.60.00","VEG.FRIED RICE -RS.60.00","EGG NOODLES -RS.70.00","EGG FRIED RICE -RS.70.00","CHICKEN NOODLES -RS.80.00","CHICKEN FRIED RICE -RS.80.00","CHICKEN PEPPER FRY -RS.80.00"
                    ,"CHICKEN MASALA -RS.80.00","CHICKEN MANCHURIAN -RS.80.00","CHICKEN 65 -RS.70.00","GOBI MANCHURIAN -RS.70.00","GOBI 65 -RS.65.00",
                    "GOBI MASALA -RS.70.00","VEG ROLL -RS.25.00","EGG ROLL -RS.30.00","CHICKEN ROLL -RS.30.00","CHICKEN BRIYANI -RS.110.00"};
            ArrayAdapter<String> adapter = new ArrayAdapter<>(canteenitem.this, android.R.layout.simple_list_item_1, item);
            list.setAdapter(adapter);
        }
     else if (str.equals("third")) {
         String item[] = {"IDLY [2NOS] -RS.15.00","PONGAL -RS.30.00","KAL DOSAI [1NOS] -RS.20.00","PLAIN DOSAI [1NOS] -RS.35.00","MASALA DOSAI [1NOS] -RS.45.00","ONION DOSAI [1NOS] -RS.50.00","EGG DOSAI [1NOS] -RS.50.00"
                 ,"POORI [2NOS] -RS.30.00","PAROTTA [2NOS] -RS.40.00","CHAPPATHI [2NOS] -RS.30.00","VARIETY RICE -RS.30.00","VEG.BIRIYANI  -RS.40.00",
                 "MEALS -RS.45.00","PARCEL MEALS -RS.60.00","CURD RICE -RS.30.00","SAMBAR RICE -RS.40.00","VADAI -RS.06.00","CURD & SAMBAR VADAI -RS.20.00"};
         ArrayAdapter<String> adapter = new ArrayAdapter<>(canteenitem.this, android.R.layout.simple_list_item_1, item);
         list.setAdapter(adapter);
     }
    }
}