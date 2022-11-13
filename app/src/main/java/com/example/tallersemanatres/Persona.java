package com.example.tallersemanatres;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Persona extends RecyclerView.ViewHolder {

    TextView tvPersona;

    public Persona(@NonNull View itemView) {
        super(itemView);
        tvPersona = itemView.findViewById(R.id.tvPersona);
    }
}
