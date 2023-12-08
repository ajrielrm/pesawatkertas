package com.example.pesawat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class activity_dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        RecyclerView recyclerViewCombined = findViewById(R.id.recyclerViewCombined);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerViewCombined.setLayoutManager(gridLayoutManager);

        Object[][] dataCombined = {
                {R.drawable.pesawat1, "Cessna", 100},
                {R.drawable.pesawat1, "Boeing", 150},
                {R.drawable.pesawat1, "Airbus", 200},
                {R.drawable.pesawat1, "Bombardier", 250},
                // Add more data as needed
        };

        MyAdapter adapterCombined = new MyAdapter(this, dataCombined);
        recyclerViewCombined.setAdapter(adapterCombined);
    }
}


