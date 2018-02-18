package com.example.nabila.nabila_1202150253_modul2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    //deklarasi dan inisiasi variable umum/global
    RadioGroup group;
    RadioButton bt1, bt2;
    Button pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //sebagai id dari layout activity_menu.xml
        group = findViewById(R.id.rb_group);
        bt1 = findViewById(R.id.rb_menu1);
        bt2 = findViewById(R.id.rb_menu2);
        pesan = findViewById(R.id.bt_pesansekarang);

        //memilih button yang akan menunjukan ke activity yang dipilih dan pada button akan mengarahkan ke layoutnya
        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selecteId = group.getCheckedRadioButtonId();
                if (selecteId == bt1.getId()){
                    Intent menu1 = new Intent(MenuActivity.this, DineInActivity.class);
                    startActivity(menu1);
                    Toast.makeText(getApplicationContext(), "Dine In", Toast.LENGTH_SHORT).show();
                    finish();

                }if (selecteId == bt2.getId()){
                    Intent menu2 = new Intent(MenuActivity.this, TakeawayActivity.class);
                    startActivity(menu2);
                    Toast.makeText(getApplicationContext(), "Take Away", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
    }
}
