package com.example.nabila.nabila_1202150253_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    //deklarasi dan inisiasi variable umum/global
    private ImageView gambarMenu;
    private TextView menu, harga, komposisi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //menampilkan toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Detail Makanan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Melakukan inisiasi pada id
        menu = (TextView) findViewById(R.id.tv_menu1);
        harga = (TextView) findViewById(R.id.tv_harga);
        komposisi = (TextView) findViewById(R.id.komposisi1);
        gambarMenu = (ImageView) findViewById(R.id.tv_gambar);

        //melakukan get data dari menu fitur sebelumnya sudah membawa data yang dikirim
        Intent intent = getIntent();

        String Menu = intent.getStringExtra("menu");
        String Harga = intent.getStringExtra("harga");
        String Komposisi = intent.getStringExtra("komposisi");
        Integer Gambar = intent.getIntExtra("gambar", 0);

        //melakukan set tex maupun setImageResource untuk data yang sudah di bawa dari layout sebelumnya
        menu.setText(Menu);
        harga.setText(Harga);
        komposisi.setText(Komposisi);
        gambarMenu.setImageResource(Gambar);
    }
}
