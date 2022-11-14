package com.example.tallersemanatres;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter <Persona> {

    List<String> personas;

    public Adaptador(List<String> datos){
        personas = datos;
    }

    @NonNull
    @Override
    public Persona onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View miCajon;
        miCajon = LayoutInflater.from(parent.getContext()).inflate(R.layout.persona, parent, false);
        return new Persona(miCajon);
    }

    @Override
    public void onBindViewHolder(@NonNull Persona holder, int position) {
        String miDato = personas.get(position);
        holder.tvPersona.setText(miDato);
    }

    @Override
    public int getItemCount() {

        if (personas != null){
            return personas.size();
        }else{
            return 0;
        }
    }
}
