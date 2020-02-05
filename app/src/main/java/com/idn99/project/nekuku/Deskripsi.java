package com.idn99.project.nekuku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Deskripsi extends AppCompatActivity {
    private ImageView img;
    private TextView tv1,tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);

        Data data = getIntent().getParcelableExtra("data" );

        img = findViewById(R.id.image_des);
        tv1 = findViewById(R.id.tv1_des);
        tv2 = findViewById(R.id.tv2_des);
        tv3 = findViewById(R.id.tv3_des);

        img.setImageResource(data.getGambarData());
        tv1.setText(data.getMusimData());
        tv2.setText(data.getJudulData());
        tv3.setText(data.getDeskripsiData());

    }
}
