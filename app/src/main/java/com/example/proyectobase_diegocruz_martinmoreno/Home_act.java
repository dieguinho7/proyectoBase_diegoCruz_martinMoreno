package com.example.proyectobase_diegocruz_martinmoreno;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import Objetos.Insumos;

public class Home_act extends AppCompatActivity {

    private Insumos in = new Insumos();
    private VideoView videoview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        videoview = (VideoView)findViewById(R.id.vw);

        //Obtengo la ruta del video
        String ruta = "android.resource://" + getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(ruta); //parseo la ruta, oye a partir de la ruta traeme los elementos de la interfaz
        videoview.setVideoURI(uri); //paso el video a mi VideoView

         videoview.start(); //repoduce el video

        //Controles para el video
        //MediaController media = new MediaController(this);
        //videoview.setMediaController(media);//le paso mi control

    }
    //Tarea pesada...


    public void Insumos(View view)
    {
        Intent i = new Intent(this, Insumos_act.class);
        //Preparo los extras
        Bundle bun = new Bundle(); //Necesario para enviar arreglos
        bun.putStringArray("insumos",in.getInsumos()); // relleno el bundle
        i.putExtras(bun);
        startActivity(i);
    }
}