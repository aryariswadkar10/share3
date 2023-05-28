package com.example.exp12;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView t1,t2,t3,t4;
    EditText txt5,txt6;
    Button b1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1 = findViewById(R.id.txt1);
        t2 = findViewById(R.id.txt2);
        t3 = findViewById(R.id.txt3);
        t4 = findViewById(R.id.txt4);

        txt5 = findViewById(R.id.txt5);
        txt6 = findViewById(R.id.txt6);
        b1 = findViewById(R.id.button);

        Intent i = getIntent();
        if(i!=null)
        {
            String str1 = i.getStringExtra("name");
            String str2 = i.getStringExtra("email");
            String str3 = i.getStringExtra("phone");
            String str4 = i.getStringExtra("roll");

            t1.setText(str1);
            t2.setText(str2);
            t3.setText(str3);
            t4.setText(str4);
        }

        b1.setOnClickListener(view -> {
            String str5 = txt5.getText().toString();
            String str6 = txt6.getText().toString();

            Intent i1 = new Intent(MainActivity2.this,MainActivity3.class);
            i1.putExtra("class",str5);
            i1.putExtra("div",str6);
            startActivity(i1);
        });
    }
}
