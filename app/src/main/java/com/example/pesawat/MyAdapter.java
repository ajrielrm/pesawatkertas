    package com.example.pesawat;

    import android.content.Context;
    import android.content.Intent;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.ImageView;
    import android.widget.TextView;

    import androidx.annotation.NonNull;
    import androidx.recyclerview.widget.RecyclerView;

    import com.example.pesawat.R;
    public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
        private Object[][] data;
        private Context context;

        public MyAdapter(Context context, Object[][] data) {
            this.context = context;
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
            holder.imgPesawat.setImageResource((Integer) data[position][0]);
            holder.title.setText(String.valueOf(data[position][1]));

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int clickedPosition = holder.getAdapterPosition();
                    if (clickedPosition != RecyclerView.NO_POSITION) {
                        openDetailsActivity(clickedPosition);
                    }
                }
            });
        }

        @Override
        public int getItemCount() {
            return data.length;
        }

        private void openDetailsActivity(int position) {
            Intent intent = new Intent(context, checkout.class);
            intent.putExtra("imageResource", (Integer) data[position][0]);
            intent.putExtra("title", String.valueOf(data[position][1]));
            intent.putExtra("price", (Integer) data[position][2]);
            context.startActivity(intent);
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

