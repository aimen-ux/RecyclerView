package com.aimen.recyclerveiw_191157;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.sql.Struct;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    String [] animes = {"Death Note", "Wolf Girl", "Mirrai Nikki", "The Promised Neverland", "Bed and Breakfast for Spirits",
            "Maid Sama", "Naruto", "One Piece", "Fruit Basket", "Re:Zero"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_animes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerAdapter = new RecyclerAdapter(animes, this);
        recyclerView.setAdapter(recyclerAdapter);
    }
}



