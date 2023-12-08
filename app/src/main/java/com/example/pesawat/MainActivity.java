package com.example.pesawat;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.WindowManager;
import android.widget.Button;
import android.view.View;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });

    }

    public void openNewActivity(){
        Intent intent = new Intent(this, activity_dashboard.class);
        startActivity(intent);
    }
}