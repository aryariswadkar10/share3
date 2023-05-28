package com.example.exp12;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView t5,t6;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        t5 = findViewById(R.id.txt5);
        t6 = findViewById(R.id.txt6);

        Intent i = getIntent();
        if(i!=null)
        {
            String str5 = i.getStringExtra("class");
            String str6 = i.getStringExtra("div");

            t5.setText(str5);
            t6.setText(str6);
        }
    }
}
