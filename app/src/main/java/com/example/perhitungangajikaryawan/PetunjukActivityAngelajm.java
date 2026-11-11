package com.example.perhitungangajikaryawan;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class PetunjukActivityAngelajm extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petunjuk_angelajm);
        Button btnKembali = findViewById(R.id.btnKembaliPetunjukAngelajm);
        btnKembali.setOnClickListener(v -> finish());
    }
}