package com.example.perhitungangajikaryawan;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class GajiActivityAngelajm extends AppCompatActivity {
    EditText etGapok, etTunjJabatan, etHariKerja, etTunjMakan, etTunjTransport, etGajiKotor, etPajak, etGajiBersih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaji_angelajm);

        etGapok = findViewById(R.id.etGapokAngelajm);
        etTunjJabatan = findViewById(R.id.etTunjJabatanAngelajm);
        etHariKerja = findViewById(R.id.etHariKerjaAngelajm);
        etTunjMakan = findViewById(R.id.etTunjMakanAngelajm);
        etTunjTransport = findViewById(R.id.etTunjTransportAngelajm);
        etGajiKotor = findViewById(R.id.etGajiKotorAngelajm);
        etPajak = findViewById(R.id.etPajakAngelajm);
        etGajiBersih = findViewById(R.id.etGajiBersihAngelajm);

        Button btnHitung = findViewById(R.id.btnHitungAngelajm);
        Button btnKembali = findViewById(R.id.btnKembaliAngelajm);

        btnHitung.setOnClickListener(v -> {
            try {
                double gapok = Double.parseDouble(etGapok.getText().toString());
                double tunjJab = Double.parseDouble(etTunjJabatan.getText().toString());
                int hari = Integer.parseInt(etHariKerja.getText().toString());

                double tunjMakan = hari * 10000;
                double tunjTransport = hari * 5000;
                double gajiKotor = gapok + tunjJab + tunjMakan + tunjTransport;
                double pajak = gajiKotor * 0.10;
                double gajiBersih = gajiKotor - pajak;

                etTunjMakan.setText(String.valueOf(tunjMakan));
                etTunjTransport.setText(String.valueOf(tunjTransport));
                etGajiKotor.setText(String.valueOf(gajiKotor));
                etPajak.setText(String.valueOf(pajak));
                etGajiBersih.setText(String.valueOf(gajiBersih));
            } catch (Exception e) {
                Toast.makeText(this, "Lengkapi semua input dulu!", Toast.LENGTH_SHORT).show();
            }
        });

        btnKembali.setOnClickListener(v -> finish());
    }
}