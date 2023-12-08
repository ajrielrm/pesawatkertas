package com.example.pesawat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class details extends AppCompatActivity {
    private Object[] cardData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        cardData = (Object[]) intent.getSerializableExtra("cardData");
        int imageResource = intent.getIntExtra("imageResource", 0);
        String title = intent.getStringExtra("title");
        int price = intent.getIntExtra("price", 0);
        int pax = intent.getIntExtra("pax", 0);
        int total = price * pax;


        Log.d("DetailsActivity", "Title from Intent: " + title);

        TextView titleTextView = findViewById(R.id.total);
        TextView titlepesawat = findViewById(R.id.title);

        String hasil = "Rp. " + (String.valueOf(total));
        titleTextView.setText(hasil);
        titlepesawat.setText(title);


    }
}