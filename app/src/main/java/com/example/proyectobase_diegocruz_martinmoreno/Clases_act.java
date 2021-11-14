package com.example.proyectobase_diegocruz_martinmoreno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Clases_act extends AppCompatActivity {

    private EditText code, clase, intensi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clases);

        code = findViewById(R.id.code);
        clase = findViewById(R.id.clase);
        intensi = findViewById(R.id.inte);
    }
}