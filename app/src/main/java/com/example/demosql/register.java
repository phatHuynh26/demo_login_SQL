package com.example.demosql;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity {
    EditText userdk, passdk;
    Button btnRes;
    String URL ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        userdk = findViewById(R.id.name_res);
        passdk = findViewById(R.id.pass_res);
        btnRes = findViewById(R.id.btn_login);
        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Str
            }
        });
    }
}