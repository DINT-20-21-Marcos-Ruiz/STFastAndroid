package com.example.stfastdesktop.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stfastdesktop.APIREST.ProveedorServicios;
import com.example.stfastdesktop.Adaptador;
import com.example.stfastdesktop.ComunicaFragments;
import com.example.stfastdesktop.POJO.Competicion;
import com.example.stfastdesktop.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.stfastdesktop.APIREST.RespuestaJSon.crearRetrofit;

public class FragmentRecyclerAmistoso extends Fragment implements View.OnClickListener, View.OnLongClickListener{
    FloatingActionButton fab;
    RecyclerView recicler;
    Adaptador adap;
    View view;
    List<Competicion> amistososos;
    //COMUNICAR FRAGMENTS
    ComunicaFragments comunicaFragments;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.recycler_amistoso,container,false);
        recicler = view.findViewById(R.id.recycler_amistoso);
        fab = view.findViewById(R.id.añadirAmistoso_fab);

        getAmistosos();
        adap = new Adaptador(getContext(),amistososos);


        adap.setOnClickListener(this);

        recicler.setHasFixedSize(true);
        recicler.setAdapter(adap);
        recicler.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL,false));

        fab.setOnClickListener(this);

        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        //comunicaFragments = (ComunicaFragments) context;

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public boolean onLongClick(View v) {
        return false;
    }


    private void getAmistosos()
    {
        ProveedorServicios proveedorServicios = crearRetrofit();
        Call<List<Competicion>> responseCall=proveedorServicios.getCompeticiones();
        responseCall.enqueue(new Callback<List<Competicion>>() {
            @Override
            public void onResponse(Call<List<Competicion>> call, Response<List<Competicion>> response) {
                amistososos = response.body();
            }

            @Override
            public void onFailure(Call<List<Competicion>> call, Throwable t) {
                Log.e("Error", t.toString());
                Toast.makeText(getContext(), "Error" + t.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

}
