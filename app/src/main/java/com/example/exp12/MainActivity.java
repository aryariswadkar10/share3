package com.example.exp12;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText txt1,txt2,txt3,txt4;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);

        b1 = findViewById(R.id.button);

        b1.setOnClickListener(view -> {
            String str1 = txt1.getText().toString();
            String str2 = txt2.getText().toString();
            String str3 = txt3.getText().toString();
            String str4 = txt4.getText().toString();

            Intent i = new Intent(MainActivity.this,MainActivity2.class);
            i.putExtra("name",str1);
            i.putExtra("email",str2);
            i.putExtra("phone",str3);
            i.putExtra("roll",str4);
            startActivity(i);
        });
    }
}
