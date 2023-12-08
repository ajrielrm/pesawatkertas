package com.example.pesawat;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class checkout extends AppCompatActivity {

    private Object[] cardData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        Intent intent = getIntent();
        cardData = (Object[]) intent.getSerializableExtra("cardData");
        int imageResource = intent.getIntExtra("imageResource", 0);
        String title = intent.getStringExtra("title");
        int price = intent.getIntExtra("price", 0);

        ImageView imageView = findViewById(R.id.imagepesawatcheckout);
        TextView titleTextView = findViewById(R.id.titlecheckout);
        TextView priceTextView = findViewById(R.id.price);

        imageView.setImageResource(imageResource);
        titleTextView.setText(title);
        priceTextView.setText(String.valueOf(price));


    }

    public void onContinueButtonClick(View view) {
        EditText quantityEditText = findViewById(R.id.editText);
        String inputText = quantityEditText.getText().toString();
        int pax = Integer.parseInt(inputText);

        Intent newIntent = new Intent(this, details.class);
        newIntent.putExtra("cardData", cardData);
        newIntent.putExtra("imageResource", getIntent().getIntExtra("imageResource", 0));
        newIntent.putExtra("title", getIntent().getStringExtra("title"));
        newIntent.putExtra("price", getIntent().getIntExtra("price", 0));
        newIntent.putExtra("pax", pax);


        startActivity(newIntent);
    }
}
