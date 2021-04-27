package com.example.lab4_maithanhtrong_18064861;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class TikiActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiki_b);

        Cable[] cables = Cable.cables;
        RecyclerView cableRecycler = (RecyclerView) findViewById(R.id.cable_recycler);

        CableAdapter adapter = new CableAdapter(cables);

        cableRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        cableRecycler.setLayoutManager(layoutManager);
    }
}