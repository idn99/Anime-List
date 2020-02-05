package com.idn99.project.nekuku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Data> data = new ArrayList<>();
    private RecyclerAdapter recyclerAdapter;
    private RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateData();

        int jmlKolom = 2;
        recyclerAdapter = new RecyclerAdapter(data, getApplicationContext());
        rv = findViewById(R.id.recycler_view_home);
        rv.setLayoutManager(new GridLayoutManager(getApplicationContext(), jmlKolom));
        rv.setAdapter(recyclerAdapter);
    }

    public void generateData(){
        data.add(new Data(R.drawable.kny, "Kimetsu no Yaiba", "Summer 2019","Deskripsi Kimetsu", "Sinopsis Kimetsu"));
        data.add(new Data(R.drawable.kny, "Tate no Yuusha", "Winter 2019","Deskripsi Kimetsu", "Sinopsis Kimetsu"));
        data.add(new Data(R.drawable.kny, "My Hero Acadamia", "Fall 2019","Deskripsi Kimetsu", "Sinopsis Kimetsu"));
        data.add(new Data(R.drawable.kny, "Haikyuu", "Spring 2019","Deskripsi Kimetsu", "Sinopsis Kimetsu"));

    }
}
