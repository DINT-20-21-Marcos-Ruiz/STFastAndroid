package com.example.stfastdesktop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stfastdesktop.POJO.Competicion;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter implements View.OnClickListener,View.OnLongClickListener,View.OnTouchListener, Filterable {
    Context context;
    View.OnClickListener listener;
    View.OnLongClickListener longListener;
    View.OnTouchListener listenerTouch;
    List<Competicion> listaAmistosos;
    View view;

    public Adaptador(Context context,List<Competicion> listaAmistosos){
        this.context = context;
        this.listaAmistosos = listaAmistosos;
    }

    @NotNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_amistoso,parent,false);

        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        view.setOnTouchListener(this);

        Holder holder = new Holder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder holder, int position) {
        ((Holder)holder).bind(listaAmistosos.get(position));
    }

    @Override
    public int getItemCount() {
        return listaAmistosos.size();
    }

    public void setOnClickListener(View.OnClickListener listener){this.listener = listener;}
    @Override
    public void onClick(View v) {
        if(listener!=null)
            listener.onClick(v);
    }

    @Override
    public boolean onLongClick(View v) {
        return false;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }

    @Override
    public Filter getFilter() {
        return null;
    }
}
