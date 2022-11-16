package com.example.tallersemanatres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;

import android.os.Bundle;
import android.preference.PreferenceManager;

import org.osmdroid.config.Configuration;
import org.osmdroid.views.MapView;

public class Mapa extends AppCompatActivity {

    MapView mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        mapa = findViewById(R.id.mapa);

        //Obtener el contexto
        Context ctx = getApplicationContext();

        //Configuracion
        Configuration.getInstance().load(ctx, PreferenceManager.getDefaultSharedPreferences(ctx));
    }
}