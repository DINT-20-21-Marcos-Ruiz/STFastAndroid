package com.example.stfastdesktop.APIREST;

import com.example.stfastdesktop.POJO.Competicion;
import com.example.stfastdesktop.POJO.Equipo;
import com.example.stfastdesktop.POJO.Inscripcion;
import com.example.stfastdesktop.POJO.Juego;
import com.example.stfastdesktop.POJO.Jugador;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ProveedorServicios {
    // JUEGOS --------------------------------------------------------------->
    @GET("juego")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call<List<Juego>> getJuegos();

    @GET("juego/{id_juego}")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call<Juego> getJuego(@Path("id_juego") Integer id_juego);

    @POST("juego")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call <RespuestaJSon>insertarJuego(@Body Juego juego);

    @PUT("juego/{id_juego}")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call <RespuestaJSon>modificarJuego(@Body Juego juego);

    @DELETE("juego/{id_juego}")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call <RespuestaJSon>eliminarJuego(@Body Integer id_juego);

    // EQUIPO        --------------------------------------------------------------->
    @GET("equipo")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call<List<Equipo>> getEquipos();

    @GET("equipo/{id_equipo}")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call<List<Equipo>> getEquipo(@Path("id_equipo") Integer id_equipo);

    @POST("equipo")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call <RespuestaJSon>insertarEquipo(@Body Equipo equipo);

    @PUT("equipo/{id_equipo}")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call <RespuestaJSon>modificarEquipo(@Body Equipo equipo);

    @DELETE("equipo/{id_equipo}")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call <RespuestaJSon>eliminarEquipo(@Body Integer id_equipo);

    // COMPETICION   --------------------------------------------------------------->
    @GET("competicion")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call<List<Competicion>> getCompeticiones();

    @GET("competicion/{id_competicion}")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call<List<Competicion>> getCompeticion(@Path("id_competicion") Integer id_competicion);

    @POST("competicion")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call <RespuestaJSon>insertarCompeticion(@Body Competicion competicion);

    @PUT("competicion/{id_competicion}")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call <RespuestaJSon>modificarCompeticion(@Body Competicion competicion);

    @DELETE("competicion/{id_competicion}")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call <RespuestaJSon>eliminarCompeticion(@Body Integer id_competicion);

    // INSCRIPCION   --------------------------------------------------------------->
    @GET("inscripcion")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call<List<Inscripcion>> getInscripciones();

    @GET("inscripcion/{id_inscripcion}")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call<List<Inscripcion>> getInscripcion(@Path("id_inscripcion") Integer id_inscripcion);

    @POST("inscripcion")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call <RespuestaJSon>insertarInscripcion(@Body Inscripcion inscripcion);

    @PUT("inscripcion/{id_inscripcion}")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call <RespuestaJSon>modificarInscripcion(@Body Inscripcion inscripcion);

    @DELETE("inscripcion/{id_inscripcion}")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call <RespuestaJSon>eliminarInscripcion(@Body Integer id_inscripcion);

    // JUGADOR       --------------------------------------------------------------->
    @GET("jugador")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call<List<Jugador>> getJugadores();

    @GET("jugador/{id_jugador}")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call<Jugador> getJugador(@Path("id_jugador") Integer id_jugador);

    @POST("jugador")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call <RespuestaJSon>insertarJugador(@Body Jugador jugador);

    @PUT("jugador/{id_jugador}")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call <RespuestaJSon>modificarJugador(@Body Jugador jugador);

    @DELETE("jugador/{id_jugador}")
    @Headers({"Accept: application/json","Content-Type: application/json"})
    Call <RespuestaJSon>eliminarJugador(@Body Integer id_jugador);
}
