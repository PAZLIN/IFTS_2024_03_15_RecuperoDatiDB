package it.rizzoli.ifts_2024_03_15_cookideaspinoff_inserimentoricettedb;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface EndpointInterface {


    @GET("/api/piatti_ricette")
    Call<List<Piatto>> getPiatti();



} // fine interfaccia
