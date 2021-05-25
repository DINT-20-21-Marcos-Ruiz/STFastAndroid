package com.example.stfastdesktop;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.stfastdesktop.APIREST.ProveedorServicios;
import com.example.stfastdesktop.APIREST.RespuestaJSon;
import com.example.stfastdesktop.POJO.Juego;
import com.example.stfastdesktop.POJO.Jugador;
import com.google.android.material.textfield.TextInputEditText;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginActivity extends Activity {
    ProgressDialog espera;
    List<Jugador> jugadores;
    TextInputEditText usernameText;
    TextInputEditText contraseñaTextLogin;
    Button iniciarSesionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_sesion);
        usernameText = findViewById(R.id.userTextLogin);
        contraseñaTextLogin = findViewById(R.id.contraseñaTextLogin);
        iniciarSesionButton = findViewById(R.id.iniciarSesion_Button);

        iniciarSesionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //anyadirUsuario(new Jugador(0,"tumadre",1,"sd","pass","Hombre", Calendar.getInstance().getTime()));

                //getJugador(1);
                //getJugadores();
                getJuegos();
                /*for (Jugador j:jugadores) {
                    if(j.getApodo().equals(usernameText.toString()) && j.getPasswd().equals(contraseñaTextLogin.toString())){
                        Toast.makeText(getApplicationContext(), "Funciona", Toast.LENGTH_LONG).show();
                    }
                }*/


            }
        });
    }




    private void getJugadores()
    {
        ProveedorServicios proveedorServicios = crearRetrofit();
        Call<List<Jugador>> responseCall=proveedorServicios.getJugadores();
        //Llamada asíncrona gestionada por Retrofit y para ahorrar hilos
        responseCall.enqueue(new Callback<List<Jugador>>() {
            @Override
            public void onResponse(Call<List<Jugador>> call, Response<List<Jugador>> response) {


                    jugadores = response.body();

            }
            @Override
            public void onFailure(Call<List<Jugador>> call, Throwable t) {
                Log.w("MyTag", "requestFailed", t);
            }
        });
    }

    private void getJugador(int integer){
        ProveedorServicios proveedorServicios = crearRetrofit();
        Call<Jugador> responseCall=proveedorServicios.getJugador(integer);
        responseCall.enqueue(new Callback<Jugador>() {
            @Override
            public void onResponse(Call<Jugador> call, Response<Jugador> response) {

            }

            @Override
            public void onFailure(Call<Jugador> call, Throwable t) {

            }
        });
    }

    private void getJuegos(){
        ProveedorServicios proveedorServicios = crearRetrofit();
        Call<List<Juego>> responseCall=proveedorServicios.getJuegos();
        responseCall.enqueue(new Callback<List<Juego>>() {
            @Override
            public void onResponse(Call<List<Juego>> call, Response<List<Juego>> response) {
                if(response.isSuccessful()){
                    List<Juego> juegos = response.body();
                }
                else
                {
                    System.out.println("Request Error :: " + response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<List<Juego>> call, Throwable t) {
                Log.e("Error", t.toString());
                Toast.makeText(getApplicationContext(), "Error" + t.toString(), Toast.LENGTH_LONG).show();
                if( espera!=null)espera.dismiss();
            }
        });
    }

    private void anyadirUsuario(Jugador usuarios)
    {
        ProveedorServicios proveedorServicios = crearRetrofit();
        Call<RespuestaJSon> responseCall=proveedorServicios.insertarJugador(usuarios);
        //Llamada asíncrona gestionada por Retrofit y para ahorrar hilos
        responseCall.enqueue(new Callback<RespuestaJSon>() {
            @Override
            public void onResponse(Call<RespuestaJSon> call, Response<RespuestaJSon> response) {
                RespuestaJSon usuariosResponse = response.body();
                if(usuariosResponse !=null)  Toast.makeText(getApplicationContext(), usuariosResponse.toString(), Toast.LENGTH_LONG).show();
                else Toast.makeText(getApplicationContext(),response.message(), Toast.LENGTH_LONG).show();
                if( espera!=null)espera.dismiss();
            }
            @Override
            public void onFailure(Call<RespuestaJSon> call, Throwable t) {
                Log.e("Error", t.toString());
                Toast.makeText(getApplicationContext(), "Error" + t.toString(), Toast.LENGTH_LONG).show();
                if( espera!=null)espera.dismiss();

            }
        });
    }



    private ProveedorServicios crearRetrofit() {
        // String url = "http://192.168.43.166/usuarios/"; //para el AVD de android
        // String url = "http://10.0.2.2/usuarios/"; //para el AVD de android
        //http://xusa.iesdoctorbalmis.info/usuarios/
        String url="http://pdam16b.iesdoctorbalmis.info/apirest-STFast/"; //para servidor del instituto
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(ProveedorServicios.class);
    }
}
