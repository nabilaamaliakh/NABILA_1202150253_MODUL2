package com.example.nabila.nabila_1202150253_modul2;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class DineInActivity extends AppCompatActivity {
    //deklarasi dan inisiasi variable umum/global
    EditText username;
    Button pesanan;
    String[] meja = {"Meja 1", "Meja 2", "Meja 3", "Meja 4", "Meja 5"};
    Spinner s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        //sebagai id dari layout activity_dine_in.xml
        username = (EditText) findViewById(R.id.tv_name1);
        pesanan = (Button)findViewById(R.id.bt_pilihpesanan1);

        s1 = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, meja);

        //sebagai list dari nomor meja yang akan dipilih
        s1.setAdapter(adapter);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> pilih,
                                       View pilih1, int pilih2, long pilih3)
            {
                int index = s1.getSelectedItemPosition();
                Toast.makeText(getBaseContext(), meja[index] +" " + "telah terpilih",
                        Toast.LENGTH_SHORT).show();
            }
            public void onNothingSelected(AdapterView<?> pilih) {}
        });

        //mengarahkan button untuk ke activity selanjutnya
        pesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().length() == 0) {
                    username.setError("Isi nama anda");
                    Toast.makeText(DineInActivity.this, "Masukkan identitas nama anda", Toast.LENGTH_SHORT).show();
                } else {
                    Intent a = new Intent(DineInActivity.this, DaftarMenuActivity.class);
                    startActivity(a);
                }
            }
        });
    }
}
