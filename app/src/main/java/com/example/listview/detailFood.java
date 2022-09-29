package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detailFood extends AppCompatActivity {
    ImageView gambarFood;
    TextView nama_makan,ketr_makan;

    String key_nama = "namafood";
    String key_ketr = "ketr";
    //String key_rate = "ratefood";
    //String key_jrk = "jarakfood";
    int gbrfood;

    String namamakan;
    String ketmakan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_food);

        gambarFood=findViewById(R.id.gbr_Food);
        nama_makan = findViewById(R.id.nama_Food);
        ketr_makan = findViewById(R.id.ktr_Food);

        Bundle bundle = getIntent().getExtras();

        gbrfood = bundle.getInt(String.valueOf("gbrfood"));
        gambarFood.setImageResource(gbrfood);

        namamakan = bundle.getString("namafood");
        ketmakan =bundle.getString("ketr");

        nama_makan.setText(namamakan);
        ketr_makan.setText(ketmakan);
    }
}