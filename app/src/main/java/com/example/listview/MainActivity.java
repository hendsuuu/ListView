package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    android.widget.ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String nama[]={"Nasi Goreng","Mie Goreng","Mie Ayam",
                        "Sate","Ayam Goreng","Nasi Goreng","Mie Goreng","Mie Ayam",
                "Sate","Ayam Goreng"};
        int gambar[]={R.drawable.nasigoreng,R.drawable.miegoreng,R.drawable.mieayam,R.drawable.sate,R.drawable.ayamgoreng,R.drawable.nasigoreng,R.drawable.miegoreng,R.drawable.mieayam,R.drawable.sate,R.drawable.ayamgoreng};

        String Keterangan[] = {
                "Rp.15,000",
                "RP.12,000",
                "Rp.15.000",
                "Rp.20.000",
                "Rp.20,000",
                "Rp.15,000",
                "RP.12,000",
                "Rp.15.000",
                "Rp.20.000",
                "Rp.20,000"
        };
        String Rate[] = {
                "4.8",
                "5.0",
                "4.7",
                "4.5",
                "3.9",
                "4.8",
                "5.0",
                "4.7",
                "4.5",
                "3.9"
        };
        String Jarak[] = {
                "440 m",
                "500 m",
                "600 m",
                "515 m",
                "432 m",
                "440 m",
                "500 m",
                "600 m",
                "515 m",
                "432 m"
        };
        listView = findViewById(R.id.ListFood);
        Adapter adapter = new Adapter(this,nama,gambar,Keterangan,Rate,Jarak);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nama_food = nama[position].toString();
                int gbr_food = gambar[position];
                String ktr = Keterangan[position].toString();
                //String ret = Rate[position].toString();
                //String jrk = Jarak[position].toString();

                //Toast.makeText(MainActivity.this, ""+nama_food.trim(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,detailFood.class);
                intent.putExtra("namafood",nama_food);
                intent.putExtra("gbrfood",gbr_food);
                intent.putExtra("ketr",ktr);
                //intent.putExtra("ratefood",ret);
                //intent.putExtra("jarakfood",jrk);
                startActivity(intent);
            }
        });
    }
}