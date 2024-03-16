package it.rizzoli.ifts_2024_03_15_cookideaspinoff_inserimentoricettedb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String BASE_URL = "http://192.168.1.20:8000";

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    public void inizializza(){    // al posto di onCreate
        setContentView(R.layout.activity_main);

        EndpointInterface apiService =retrofit.create(EndpointInterface.class);

        Call<List<Piatto>> call = apiService.getPiatti();
        call.enqueue(new Callback<List<Piatto>>() {
            @Override
            public void onResponse(Call<List<Piatto>> call, Response<List<Piatto>> response) {
                List<Piatto> piatti = response.body();
                ListView listaPiatti = (ListView) findViewById(R.id.act1_listaPiatti);
                PiattiAdapter adapter = new PiattiAdapter(MainActivity.this, R.layout.act1_rowlayout_lv1, piatti);
                listaPiatti.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<List<Piatto>> call, Throwable t) {

            }
        });









    }








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
               inizializza();
    }// fine onCreate



} // fine MainActivity