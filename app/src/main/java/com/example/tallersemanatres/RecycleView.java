package com.example.tallersemanatres;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class RecycleView extends AppCompatActivity implements View.OnClickListener {

    MaterialButton btnMapa, btnCalculadora, btnEquipos;
    RecyclerView rvPersonas;
    Adaptador miAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        rvPersonas = findViewById(R.id.rvPersonas);
        rvPersonas.setLayoutManager(new LinearLayoutManager(this));

        List<String> miDatosLocales = new ArrayList<>();
        miDatosLocales.add("Deivy");
        miDatosLocales.add("Mariana");
        miDatosLocales.add("Yenifer");

        //List<String> misDatosString = Arrays.asList(getResources().getStringArray(R.array.personas));

        miAdaptador = new Adaptador(miDatosLocales);
        rvPersonas.setAdapter(miAdaptador);

        btnMapa = findViewById(R.id.mapa);
        btnMapa.setOnClickListener(this);

        btnCalculadora = findViewById(R.id.calculadora);
        btnCalculadora.setOnClickListener(this);

        btnEquipos = findViewById(R.id.equipos);
        btnEquipos.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Toast.makeText(getBaseContext(), "Mapa!!", Toast.LENGTH_LONG).show();

        Intent actividadMapa, actividadCalculadora, actividadEquipo;
        actividadMapa = new Intent(getBaseContext(), Calculadora.class);
        startActivity(actividadMapa);

        actividadCalculadora = new Intent(getBaseContext(), Calculadora.class);
        startActivity(actividadCalculadora);

        actividadEquipo = new Intent(getBaseContext(), Calculadora.class);
        startActivity(actividadEquipo);
    }
}