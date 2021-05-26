package com.example.stfastdesktop.APIREST;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RespuestaJSon {
    public int respuesta;
    public String metodo;
    public String tabla;
    public String mensaje;
    public String sqlQuery;
    public String sqlError;

    public static ProveedorServicios crearRetrofit() {
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
