package com.example.pesawat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pesawat.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Object[][] data; // Updated to use Object to handle different data types

    public MyAdapter(Object[][] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        // Assuming your data array has the following structure:
        // data[position][0] - Image resource ID
        // data[position][1] - Title
        // data[position][2] - Price (as Integer)

        // Load image from resource ID
        holder.imgPesawat.setImageResource((Integer) data[position][0]);

        holder.title.setText(String.valueOf(data[position][1]));

        // Set the integer price to the TextView
        holder.price.setText(String.valueOf(data[position][2]));
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPesawat;
        TextView title, price;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPesawat = itemView.findViewById(R.id.imgpesawat);
            title = itemView.findViewById(R.id.title);
            price = itemView.findViewById(R.id.price);
        }
    }
}

