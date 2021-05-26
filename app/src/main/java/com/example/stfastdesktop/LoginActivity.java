package com.example.stfastdesktop;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.stfastdesktop.APIREST.ProveedorServicios;
import com.example.stfastdesktop.POJO.Jugador;
import com.google.android.material.textfield.TextInputEditText;

import java.io.Serializable;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.stfastdesktop.APIREST.RespuestaJSon.crearRetrofit;

public class LoginActivity extends Activity implements Serializable {
    ProgressDialog espera;
    List<Jugador> jugadores;
    Jugador jugador;
    TextInputEditText usernameText,contraseñaTextLogin;
    TextView errorCrendencialesText;
    Button iniciarSesionButton;
    Boolean existe = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_sesion);
        usernameText = findViewById(R.id.userTextLogin);
        contraseñaTextLogin = findViewById(R.id.contraseñaTextLogin);
        iniciarSesionButton = findViewById(R.id.iniciarSesion_Button);
        errorCrendencialesText = findViewById(R.id.errorCrendencialesText);
        iniciarSesionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getJugadores();

                if (usernameText.getText().toString().isEmpty() || contraseñaTextLogin.getText().toString().isEmpty()){
                    errorCrendencialesText.setText("*Los campos tienen que estar rellenados");
                }else{
                    if(jugadores != null){
                        for (Jugador j:jugadores) {
                            if(j.getApodo().equals(usernameText.getText().toString()) && j.getPasswd().equals(contraseñaTextLogin.getText().toString())){
                                jugador = j;
                                existe = true;
                            }
                        }
                        if(existe){
                            errorCrendencialesText.setText("");

                        }
                        else errorCrendencialesText.setText("*Las credenciales no son válidas");
                    }
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra("jugadorLogin", (Parcelable) jugador);
                    startActivity(intent);
                }
            }
        });
    }


    private void getJugadores()
    {
        ProveedorServicios proveedorServicios = crearRetrofit();
        Call<List<Jugador>> responseCall=proveedorServicios.getJugadores();
        responseCall.enqueue(new Callback<List<Jugador>>() {
            @Override
            public void onResponse(Call<List<Jugador>> call, Response<List<Jugador>> response) {
                jugadores = response.body();
            }
            @Override
            public void onFailure(Call<List<Jugador>> call, Throwable t) {
                Log.e("Error", t.toString());
                Toast.makeText(getApplicationContext(), "Error" + t.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }



}
