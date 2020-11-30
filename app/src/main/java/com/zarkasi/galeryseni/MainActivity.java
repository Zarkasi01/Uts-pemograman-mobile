package com.zarkasi.galeryseni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

import com.zarkasi.galeryseni.model.Rumah;
import com.zarkasi.galeryseni.model.Tarian;

public class MainActivity extends AppCompatActivity {

    ImageButton Tari_Tradisional,Rumah_Adat;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        Tari_Tradisional = findViewById(R.id.btn_buka_tarian);
        Rumah_Adat = findViewById(R.id.btn_buka_rumah_adat);
        Tari_Tradisional.setOnClickListener(view -> bukaGaleri("Tarian"));
        Rumah_Adat.setOnClickListener(view -> bukaGaleri("Rumah"));
       
    }

    private void bukaGaleri(String jenisKesenian) {
        Log.d("MAIN","Buka activity Tarian");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisKesenian);
        startActivity(intent);
    }

}