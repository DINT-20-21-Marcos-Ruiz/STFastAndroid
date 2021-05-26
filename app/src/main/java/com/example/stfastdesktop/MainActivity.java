package com.example.stfastdesktop;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.stfastdesktop.Fragments.FragmentRecyclerAmistoso;
import com.example.stfastdesktop.POJO.Jugador;

public class MainActivity extends AppCompatActivity {
    Jugador jugador;
    FragmentRecyclerAmistoso fragmentRecyclerAmistoso;
    FragmentManager fm;
    FragmentTransaction ft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle extra = getIntent().getExtras();
        jugador = extra.getParcelable("jugadorLogin");

        fragmentRecyclerAmistoso = new FragmentRecyclerAmistoso();
        cargarFragment(fragmentRecyclerAmistoso);
    }


    private void cargarFragment(Fragment f) {
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

        if(f.getClass()!=FragmentRecyclerAmistoso.class)  ft.addToBackStack(null);
        ft.replace(R.id.contenedorMain,f);
        ft.commit();
    }
}