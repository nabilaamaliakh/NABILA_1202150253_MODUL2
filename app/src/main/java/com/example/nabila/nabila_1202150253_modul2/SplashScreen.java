package com.example.nabila.nabila_1202150253_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //memberikan toas pada saat loading
        final Toast toast = Toast.makeText(this, "Loading...", Toast.LENGTH_LONG);
        toast.show();

        //ketika proses loading sudah selesai maka nanti akan ada tampilan toas kan akan pindah ke activity selanjutnya
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(SplashScreen.this, "NABILA_1202150253", Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplicationContext(), SplashScreen.class));
                Intent intent = new Intent(SplashScreen.this, MenuActivity.class);
                startActivity(intent);
                finish();

            }
        }, 3000L);
    }
}
