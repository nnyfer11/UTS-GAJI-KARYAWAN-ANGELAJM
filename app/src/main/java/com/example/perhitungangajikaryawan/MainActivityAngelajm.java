package com.example.perhitungangajikaryawan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivityAngelajm extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_angelajm);

        Button btnGaji = findViewById(R.id.btnGajiAngelajm);
        Button btnPetunjuk = findViewById(R.id.btnPetunjukAngelajm);
        Button btnTentang = findViewById(R.id.btnTentangAngelajm);
        Button btnExit = findViewById(R.id.btnExitAngelajm);

        btnGaji.setOnClickListener(v -> startActivity(new Intent(this, GajiActivityAngelajm.class)));
        btnPetunjuk.setOnClickListener(v -> startActivity(new Intent(this, PetunjukActivityAngelajm.class)));
        btnTentang.setOnClickListener(v -> startActivity(new Intent(this, TentangActivityAngelajm.class)));
        btnExit.setOnClickListener(v -> finishAffinity());
    }
}