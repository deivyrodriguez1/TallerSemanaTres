package com.example.tallersemanatres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MaterialButton btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIngresar = findViewById(R.id.btnIngresar);

        //
        btnIngresar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(getBaseContext(), "Hola!!!", Toast.LENGTH_LONG).show();
        Intent cambiarActividad;
        cambiarActividad = new Intent(getBaseContext(), RecycleView.class);
        startActivity(cambiarActividad);
    }
}