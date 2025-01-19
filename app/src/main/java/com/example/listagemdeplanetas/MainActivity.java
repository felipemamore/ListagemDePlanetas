package com.example.listagemdeplanetas;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewPlanetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewPlanetas= findViewById(R.id.recyclerView);
        recyclerViewPlanetas.setLayoutManager(new LinearLayoutManager(this));

        List<Planetas> listaPlanetas = new ArrayList<>();
        listaPlanetas.add(new Planetas("Neptune", R.drawable.neptune));
        listaPlanetas.add(new Planetas("Uranus", R.drawable.uranus));
        listaPlanetas.add(new Planetas("Saturn", R.drawable.saturn));
        listaPlanetas.add(new Planetas("Jupter", R.drawable.jupter));
        listaPlanetas.add(new Planetas("Mars", R.drawable.mars));
        listaPlanetas.add(new Planetas("Earth", R.drawable.earth));
        listaPlanetas.add(new Planetas("Venus", R.drawable.venus));
        listaPlanetas.add(new Planetas("Mercury", R.drawable.mercury));
        listaPlanetas.add(new Planetas("Sun", R.drawable.sun));

        PlanetaAdapterRecyclerView planetaAdapterRecyclerView = new PlanetaAdapterRecyclerView(this, listaPlanetas);
        recyclerViewPlanetas.setAdapter(planetaAdapterRecyclerView);





    }


}