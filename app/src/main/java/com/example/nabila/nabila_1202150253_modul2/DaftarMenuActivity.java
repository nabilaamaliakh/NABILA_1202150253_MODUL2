package com.example.nabila.nabila_1202150253_modul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import java.util.ArrayList;

public class DaftarMenuActivity extends AppCompatActivity {
    //deklarasi dan inisiasi variable umum/global
    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> gambar;
    private TextView a, b;

    //Daftar Menu
    private String[] Menu = {"Nasi Goreng", "Mie Goreng Spesial", "Mie Kuah Spesial",
            "Sate Madura", "Nasi Wagyu", "Mie Kuah Upnormal", "Green Tea Lover",
            "Lemon Cheese", "Pisang Bakar"};

    //Daftar Harga
    private String[] Harga = {"Rp. 15.000", "Rp. 10.000", "Rp. 15.000", "Rp. 20.000",
            "Rp. 15.000", "Rp. 25.000", "Rp. 30.000", "Rp 10.000", "Rp. 20.000"};

    //Daftar Gambar
    private int[] Gambar = {R.drawable.nasi_goreng, R.drawable.mie_goreng_spesial,
            R.drawable.mie_kuah_spesial, R.drawable.sate_madura,
            R.drawable.nasi_wagyu, R.drawable.mie_kuah_upnormal,
            R.drawable.green_tea_lover, R.drawable.lemon_cheese, R.drawable.pisang_bakar};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        //mendeklarasikan array list untuk menu harga dan gambar
        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        gambar = new ArrayList<>();
        ListItem();

        rvView = (RecyclerView) findViewById(R.id.rc_menu);
        rvView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(dataMenu, dataHarga, gambar);
        rvView.setAdapter(adapter);

    }

    //mengambil data dari variable menu harga dan gambar
    private void ListItem() {
        for (int w = 0; w < Menu.length; w++) {
            dataMenu.add(Menu[w]);
            dataHarga.add(Harga[w]);
            gambar.add(Gambar[w]);
        }
    }
}
