package com.example.gd1_a_0181;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.TextView;

import com.example.gd1_a_0181.entity.Profil;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        //  Ambil data dari intent yang sebelumnya dikirimkan
        Profil profil = getIntent().getParcelableExtra("my_profil");

        //  Set background color dari layout kita
        ConstraintLayout layout = findViewById(R.id.layoutProfil);
        layout.setBackgroundColor(profil.getBackgroundColor());

        //  Set text menjadi profil kita
        TextView tvProfil = findViewById(R.id.tvProfil);
        tvProfil.setTextColor(getResources().getColor(android.R.color.white));
        tvProfil.setText("Nama : " + profil.getName() + "\nNPM : " + profil.getNpm() + "\nNo HP : " + profil.getNoHp());
    }
}