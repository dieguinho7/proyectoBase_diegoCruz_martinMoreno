package com.example.proyectobase_diegocruz_martinmoreno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Clases_act extends AppCompatActivity {

    private EditText code, auto, meses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clases);

        code = findViewById(R.id.code);
        auto = findViewById(R.id.auto);
        meses = findViewById(R.id.meses);
    }
}