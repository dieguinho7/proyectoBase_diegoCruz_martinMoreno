package com.example.proyectobase_diegocruz_martinmoreno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

import Objetos.Insumos;

public class Insumos_act extends AppCompatActivity {

    private Spinner insumos;
    private TextView result;
    private Insumos in = new Insumos();
    private RatingBar calificar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insumos);

        insumos = findViewById(R.id.spinsumos);
        result = findViewById(R.id.result);
        calificar = (RatingBar)findViewById(R.id.rb);
        //Recibir los extras
        Bundle bun = getIntent().getExtras(); //Recibo el intent que tiene los extras
        String[] listado = bun.getStringArray("insumos");

        //Relleno array
        ArrayAdapter adaptInsumos = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listado);
        insumos.setAdapter(adaptInsumos);
    }
    //Metodo para calcular insumos
    public void Calcular(View view)
    {
        String opcion = insumos.getSelectedItem().toString(); //Obtiene los valores del spinner
        int resultado = 0;
        for(int i = 0; i < opcion.length(); i++)
        {
            if(opcion.equals(in.getInsumos()[i])) //Pregunto según el insumo seleccionado
            {
                //resultado = in.getPrecio()[i];
                resultado = in.anadirAdicional(in.getPrecio()[i], 250);
                calificar.setRating(i + 1);
                break;
            }
        }
        result.setText("La opción es : " +opcion + "\nSu precio es : " + resultado);
    }
}