package com.example.gd1_a_0181;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gd1_a_0181.entity.Profil;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //  Pembuatan variabel untuk view yang akan kita beri sebuah logic
    private Button btnProfil;
    private Button btnName;
    private TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  Connectkan view tersebut dengan layoutnya dengan menggunakan findViewById
        tvName = findViewById(R.id.tv_name);
        Button btnChangeText = findViewById(R.id.btnChangeText);
        btnProfil = findViewById(R.id.btnProfil);
        btnName = findViewById(R.id.btnName);

        //  Cara 1 untuk menambahkan OnClickListener (Biar button bisa di klik)
        btnChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvName.setText("Nama Saya Adalah " + getResources().getString(R.string.name));
                Toast.makeText(MainActivity.this, "Text berhasil diganti menjadi: " + getResources().getString(R.string.name), Toast.LENGTH_SHORT).show();
            }
        });

        //  Cara 2 untuk menambahkan OnClickListener (Biar button bisa di klik)
        btnName.setOnClickListener(this);
        btnProfil.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        //  Cek jika button yang di-klik adalah button Profil
        if (view.getId() == btnProfil.getId()) {
            //  Ganti dengan data profil kalian sendiri
            Profil profil = new Profil("Vito Carlen Giovanni", "190710181", "085211119961", Color.rgb(0, 180, 0));

            // Mendefinisikan Intent dan data yang ingin di kirim
            Intent moveProfil = new Intent(this, ProfilActivity.class);
            moveProfil.putExtra("my_profil", profil);

            //  Navigavasi menuju activity baru
            startActivity(moveProfil);

        } else if (view.getId() == btnName.getId()) {
            Intent moveName = new Intent(this, NameActivity.class);
            moveName.putExtra("my_name", tvName.getText());

            startActivity(moveName);
        }
    }
}