package com.example.nabila.nabila_1202150253_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TakeawayActivity extends AppCompatActivity {
    //deklarasi dan inisiasi variable umum/global
    EditText username, phone, alamat, catatan;
    Button pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takeaway);

        //sebagai id dari layout activity_takeaway.xml
        username = (EditText) findViewById(R.id.tv_name);
        phone = (EditText) findViewById(R.id.tv_phone);
        alamat = (EditText) findViewById(R.id.tv_alamat);
        catatan = (EditText) findViewById(R.id.tv_catatan);
        pesan = (Button) findViewById(R.id.bt_pilihpesanan);

        //mengarahkan button ke activity selanjutnya dan harus mengisi
        // identitas pada semua textView dan akan memberikan warning jika identitas tidak diisikan
        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().length() == 0) {
                    username.setError(" Harap mengisi nama anda");
                    Toast.makeText(TakeawayActivity.this, "Isi terlebih dulu nama anda", Toast.LENGTH_SHORT).show();
                } else if (phone.getText().toString().length() == 0) {
                    phone.setError("Harap mengisi telepon anda");
                    Toast.makeText(TakeawayActivity.this, "Isi kolom phone terlebih dulu", Toast.LENGTH_SHORT).show();
                } else if (alamat.getText().toString().length() == 0) {
                    alamat.setError("Harap mengisi alamat anda");
                    Toast.makeText(TakeawayActivity.this, "Isi kolom alamat terlebih dulu", Toast.LENGTH_SHORT).show();
                } else {
                    Intent take = new Intent(TakeawayActivity.this, DaftarMenuActivity.class);
                    startActivity(take);
                    Toast.makeText(TakeawayActivity.this, "Terima Kasih telah menginputkan data", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
