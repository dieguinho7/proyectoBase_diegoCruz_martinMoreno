package com.example.proyectobase_diegocruz_martinmoreno.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {

    //CONSTRUCTOR PARA INSTANCIAR LA DATABASE...
    public AdminSQLiteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    //ME PERMITE CONFIGURAR MI MODELO DE TRABAJO (CREAR TABLAS Y CAMPOS)...
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE clases (codigo int primary key, clase text, intensidad text)");

    }
    //ME PERMITE REALIZAR CAMBIOS ESQUEMATICOS EN EL MODELO...
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
