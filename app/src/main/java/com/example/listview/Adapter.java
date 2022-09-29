package com.example.listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Adapter extends ArrayAdapter {
    String nama[];
    int gambar[];
    String Keterangan[];
    String Rate[];
    String Jarak[];

    Activity activity;

    public Adapter(MainActivity activity, String[] nama, int[] gambar, String[] Keterangan,String[] Rate,String[] Jarak) {
        super(activity,R.layout.list_item,nama);
        this.nama = nama;
        this.gambar = gambar;
        this.Rate = Rate;
        this.Jarak = Jarak;
        this.Keterangan = Keterangan;
        this.activity = activity;
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View v=inflater.inflate(R.layout.list_item,null);

        ImageView gambare;
        TextView name;
        TextView Ket;
        TextView Ret;
        TextView s;

        gambare = v.findViewById(R.id.gambar_food);
        name = v.findViewById(R.id.nama_food);
        Ket = v.findViewById(R.id.keterangan);
        Ret = v.findViewById(R.id.rate);
        s = v.findViewById(R.id.jarak);

        gambare.setImageResource(gambar[position]);
        s.setText(Jarak[position]);
        Ret.setText(Rate[position]);
        Ket.setText(Keterangan[position]);
        name.setText(nama[position]);

        return v;
    }
}
