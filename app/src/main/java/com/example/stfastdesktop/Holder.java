package com.example.stfastdesktop;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stfastdesktop.POJO.Competicion;

import org.jetbrains.annotations.NotNull;

public class Holder extends RecyclerView.ViewHolder{
    TextView id,tipo,  nombre, capacidad, fecha, premio;
    public Holder(@NonNull @NotNull View itemView) {
        super(itemView);
        id = itemView.findViewById(R.id.idAmistoso_Text);
        tipo = itemView.findViewById(R.id.tipoCompeticion_Text);
        nombre = itemView.findViewById(R.id.nombreAmistoso_Text);
        fecha = itemView.findViewById(R.id.fechaAmistoso_Text);

    }

    public void bind(Competicion competicion)
    {
        id.setText(competicion.getId_competicion());
        tipo.setText(competicion.getTipo());
        nombre.setText(competicion.getCnombre());
        fecha.setText(competicion.getFecha());

    }
}
