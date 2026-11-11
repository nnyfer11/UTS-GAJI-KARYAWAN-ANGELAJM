package com.example.perhitungangajikaryawan;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class TentangActivityAngelajm extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_angelajm);
        Button btnKembali = findViewById(R.id.btnKembaliTentangAngelajm);
        btnKembali.setOnClickListener(v -> finish());
    }
}