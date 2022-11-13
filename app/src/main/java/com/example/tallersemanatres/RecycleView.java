package com.example.tallersemanatres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class RecycleView extends AppCompatActivity implements View.OnClickListener {

    MaterialButton btnMapa, btnCalculadora, btnEquipos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        btnMapa = findViewById(R.id.mapa);
        btnCalculadora = findViewById(R.id.calculadora);
        btnEquipos = findViewById(R.id.equipos);

        btnMapa.setOnClickListener(this);
        btnCalculadora.setOnClickListener(this);
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