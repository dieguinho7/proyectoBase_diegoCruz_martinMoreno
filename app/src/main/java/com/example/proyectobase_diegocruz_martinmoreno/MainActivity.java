package com.example.proyectobase_diegocruz_martinmoreno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import Objetos.Administrador;
import Objetos.Insumos;

public class MainActivity extends AppCompatActivity {

    private EditText user, pass;
    private TextView msj;
    private Administrador adm = new Administrador(); //la instancia del obj Administrador
    private Insumos in = new Insumos();
    private Button btn;
    private ProgressBar barra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText)findViewById(R.id.etuser);
        pass = (EditText)findViewById(R.id.etpass);
        msj = (TextView)findViewById(R.id.msj);
        barra = (ProgressBar)findViewById(R.id.pb);
        btn = (Button)findViewById(R.id.btn);

        barra.setVisibility(View.INVISIBLE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Aquí corremos nuestra tarea
                new Task().execute();
            }
        });

    }
    //Mi tarea asincrona.
    class Task extends AsyncTask<String, Void, String>
    {
        //Es la configuración inicial de mi tarea asincrona
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            barra.setVisibility(View.VISIBLE);
        }
        //Se encarga de llevar el proceso en segundo plano
        @Override
        protected String doInBackground(String... strings) {
            try{
                for(int i = 0; i<=10; i++)
                {
                    Thread.sleep(200); //DORMIMOS UN PROCESO POR UN LAPSO DE 25000 milis

                }
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            return null;
        }
        //Es donde termina mi tarea asíncrona
        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
                String usuario = user.getText().toString().trim();
                String contrasena = pass.getText().toString().trim();

                String userObj = adm.getUser().trim();
                String passObj = adm.getPass().trim();

                switch(usuario)
                {
                    case "Diego":
                        if(usuario.equals(userObj) && contrasena.equals(passObj))
                        {
                            //Inicia sessión
                            Intent i = new Intent(getBaseContext(), Home_act.class);
                            startActivity(i);
                        }
                        break;
                    case "":
                        if(usuario.equals("") && contrasena.equals(""));
                    {
                        //campos vacios
                        msj.setText("Los campos son vacíos por favor ingrese nuevamente");
                    }
                    break;
                    default:
                        if(!usuario.equals(userObj) && !contrasena.equals(passObj));
                    {
                        //campos incorrectos
                        msj.setText("Campos incorrectos porfavor ingrese nuevamente");
                    }
                    break;
                }

            //Intent i = new Intent(getBaseContext(), Home_act.class);
            //startActivity(i);
        }
    }


    public void Facebook(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW); //Acción para abrir un sitio web
        i.setData(Uri.parse("https://www.facebook.com//"));
        startActivity(i);
    }
    public void Twitter(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.twitter.com//"));
        startActivity(i);
    }
    public void Youtube(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.youtube.com//"));
        startActivity(i);
    }
    public void Info(View view)
    {
        Intent i = new Intent(this, Info_act.class);
        startActivity(i);

    }
}